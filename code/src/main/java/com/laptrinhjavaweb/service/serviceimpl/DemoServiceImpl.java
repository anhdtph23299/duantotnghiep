package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.Demo;
import com.laptrinhjavaweb.repository.DemoRepository;
import com.laptrinhjavaweb.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;
    @Override
    public List<Demo> getall() {
        return demoRepository.findAll();
    }
}
