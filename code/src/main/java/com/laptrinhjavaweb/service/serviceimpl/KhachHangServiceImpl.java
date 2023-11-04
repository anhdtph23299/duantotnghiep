package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.converter.KhachHangConvertToDto;
import com.laptrinhjavaweb.dto.KhachHangDto;
import com.laptrinhjavaweb.dto.LoginDto;
import com.laptrinhjavaweb.dto.LoginMessage;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.KhachHangService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepository khachHangRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    KhachHangConvertToDto convert;

    @Override
    public List<KhachHang> getDsKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang findById(Long id) {
        Optional<KhachHang> khachHang= khachHangRepository.findById(id);
        return khachHang.orElse(null);
    }

    @Override
    public String update(KhachHang khachHang) {
        if(khachHangRepository.findById(khachHang.getId()).orElse(null)==null){
            return "Không có mã khách hàng này";
        }
        return khachHangRepository.save(khachHang)!=null?"Sửa thành công":"Thêm thất bại";
    }

    @Override
    public KhachHang insert(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public void delete(Long id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public List<KhachHang> getSearchKhachHang(String maKH, String tenKH, String email, String sdt, String diaChi, String cccd){
        return khachHangRepository.findByMaKHContainingOrTenKHContainingOrEmailContainingOrSdtContainingOrDiaChiContainingOrCccdContaining(maKH.trim(),tenKH.trim(),email.trim(),sdt.trim(),diaChi.trim(),cccd.trim());
    }

    @Override
    public void importCustomersFromExcel(InputStream inputStream) {
        try {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    // Bỏ qua dòng tiêu đề
                    continue;
                }

                KhachHang customer = new KhachHang();
                customer.setMaKH(row.getCell(0).getStringCellValue());
                customer.setTenKH(row.getCell(1).getStringCellValue());
                customer.setSdt(row.getCell(2).getStringCellValue());
                customer.setEmail(row.getCell(3).getStringCellValue());
                customer.setGioiTinh(row.getCell(4).getBooleanCellValue());
                customer.setNgaySinh(row.getCell(5).getDateCellValue());
                customer.setDiaChi(row.getCell(6).getStringCellValue());
                customer.setCccd(row.getCell(7).getStringCellValue());
                customer.setNgayDangKy(row.getCell(8).getDateCellValue());
                customer.setMoTa(row.getCell(9).getStringCellValue());
                customer.setTrangThai((int) row.getCell(10).getNumericCellValue());

                khachHangRepository.save(customer);
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Workbook exportCustomersToExcel(List<KhachHang> customers) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Customers");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("MaKH");
        header.createCell(1).setCellValue("TenKH");
        header.createCell(2).setCellValue("SDT");
        header.createCell(3).setCellValue("Email");
        header.createCell(4).setCellValue("GioiTinh");
        header.createCell(5).setCellValue("NgaySinh");
        header.createCell(6).setCellValue("DiaChi");
        header.createCell(7).setCellValue("CCCD");
        header.createCell(8).setCellValue("NgayDangKy");
        header.createCell(9).setCellValue("MoTa");
        header.createCell(10).setCellValue("TrangThai");

        // Tạo một CellStyle cho định dạng ngày tháng
        CellStyle dateStyle = workbook.createCellStyle();
        CreationHelper createHelper = workbook.getCreationHelper();
        dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        int rowNum = 1;
        for (KhachHang khachHang : customers) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(khachHang.getMaKH());
            row.createCell(1).setCellValue(khachHang.getTenKH());
            row.createCell(2).setCellValue(khachHang.getSdt());
            row.createCell(3).setCellValue(khachHang.getEmail());
            row.createCell(4).setCellValue(khachHang.getGioiTinh() ? "Nam" : "Nữ");

            // Đặt định dạng cho ô chứa ngày tháng
            row.createCell(5).setCellValue(khachHang.getNgaySinh());
            row.getCell(5).setCellStyle(dateStyle);

            row.createCell(6).setCellValue(khachHang.getDiaChi());
            row.createCell(7).setCellValue(khachHang.getCccd());
            row.createCell(8).setCellValue(khachHang.getNgayDangKy());
            row.getCell(8).setCellStyle(dateStyle);

            row.createCell(9).setCellValue(khachHang.getMoTa());
            row.createCell(10).setCellValue(khachHang.getTrangThai() == 1 ? "Hoạt động" : "Ngừng hoạt động");
        }

        return workbook;
    }

    @Override
    public KhachHang addKhachHang(KhachHangDto khachHangDto) {
        KhachHang kh = convert.convertoDto(khachHangDto);
        khachHangRepository.save(kh);
        return kh;
    }

    @Override
    public LoginMessage loginKhachHang(LoginDto loginDto) {
        KhachHang kh1 = khachHangRepository.findByEmail(loginDto.getEmail());
        if(kh1 != null){
            String pass = loginDto.getPassword();
            String encodedPassword = kh1.getMatKhau();
            Boolean isCheck = passwordEncoder.matches(pass, encodedPassword);
            if(isCheck ){
                Optional<KhachHang> kh = khachHangRepository.findByEmailAndMatKhau(loginDto.getEmail(), encodedPassword);
                if(kh.isPresent()){
                    return new LoginMessage("Login thanh cong", true);
                }else{
                    return  new LoginMessage("Login that bai", false);
                }
            }else{
                return new LoginMessage("Mat khau khong chinh xac", false);
            }
        }else{
            return new LoginMessage("Email khong chinh xac", false);
        }
    }


}
