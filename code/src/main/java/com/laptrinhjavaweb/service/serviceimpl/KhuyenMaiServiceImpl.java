package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.repository.KhuyenMaiRepository;
import com.laptrinhjavaweb.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {

    @Autowired
    KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public List<KhuyenMai> getAll() {
        return this.khuyenMaiRepository.findAll();
    }

    @Override
    public KhuyenMai findById(Long id) {
        return this.khuyenMaiRepository.findById(id).orElse(null);
    }

    @Override
    public String insert(KhuyenMai khuyenMai) {
         Date ngayBatDau = khuyenMai.getNgayBatDau();
         Date ngayKetThuc = khuyenMai.getNgayKetThuc();
        System.out.println(ngayBatDau);
        KhuyenMai km = this.khuyenMaiRepository.save(khuyenMai);
        if(km != null){
            return "Insert thanh cong";
        }else{
            return "Insert that bai";
        }
    }


    public Date convertDate(String str){
        // Input date format
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        inputDateFormat.setTimeZone(TimeZone.getTimeZone("ICT"));

        // Output date format
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date inputDate = null; // Parse the input date
        try {
            inputDate = inputDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formattedDateStr = outputDateFormat.format(inputDate); // Format it to the desired format

        try {
            return outputDateFormat.parse(formattedDateStr); // Parse the formatted date string back to a Date object
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String update(KhuyenMai khuyenMai, Long id) {
        return null;
    }

    @Override
    public String delete(Long id) {
        KhuyenMai km = this.khuyenMaiRepository.findById(id).orElse(null);
        if(km != null){
            this.khuyenMaiRepository.delete(km);
            return "Xoa thanh cong";
        }else{
            return "Khong tim thay";
        }
    }
}
