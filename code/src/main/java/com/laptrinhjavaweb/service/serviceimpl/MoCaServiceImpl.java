package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.MoCa;
import com.laptrinhjavaweb.repository.MoCaRepository;
import com.laptrinhjavaweb.service.MoCaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class MoCaServiceImpl implements MoCaService {

    @Autowired
    private MoCaRepository moCaRepository;

    @Override
    public List<MoCa> getMoCa() {
        return moCaRepository.findAll();
    }

    @Override
    public MoCa insert(MoCa moCa) {
        moCa.setThoiGian(LocalDateTime.now());
        return moCaRepository.save(moCa);
    }

//    @Override
//    public String getThoiGianFromDB() {
//        LocalDateTime thoiGian = moCaRepository.findLastThoiGian();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        return thoiGian.format(formatter);
//    }

    @Override
    public String getCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
