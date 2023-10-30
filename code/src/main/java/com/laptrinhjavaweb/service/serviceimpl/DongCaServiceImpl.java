package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.DongCa;
import com.laptrinhjavaweb.repository.DongCaRepository;
import com.laptrinhjavaweb.service.DongCaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DongCaServiceImpl implements DongCaService {

    @Autowired
    private DongCaRepository dongCaRepository;

    @Override
    public List<DongCa> getDongCa() {
        return dongCaRepository.findAll();
    }

    @Override
    public String getCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
