package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.DongCa;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.MoCa;

import java.time.LocalDateTime;
import java.util.List;

public interface MoCaService {

    List<MoCa> getMoCa();

    MoCa insert(MoCa moCa);

//    String getThoiGianFromDB() ;

    String getCurrentDateTime();
}
