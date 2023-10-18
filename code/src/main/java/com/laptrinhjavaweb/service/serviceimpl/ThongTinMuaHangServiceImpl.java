package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.repository.ThongTinMuaHangRepository;
import com.laptrinhjavaweb.service.ThongTinMuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThongTinMuaHangServiceImpl implements ThongTinMuaHangService {

    @Autowired
    private ThongTinMuaHangRepository thongTinMuaHangRepository;
    @Override
    public ThongTinMuaHang findThongTinMuaHangDefault(Long idkh) {
        List<Integer> trangThai = new ArrayList<>();
        trangThai.add(2);
        return thongTinMuaHangRepository.getTTMuaHangByIdKHAndTrangThai(idkh,trangThai);
    }
}
