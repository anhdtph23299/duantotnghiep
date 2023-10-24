package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.CaLamViec;

import java.util.List;

public interface CaLamViecService {

    List<CaLamViec> getDsCaLamViec();

    CaLamViec findById(Long id);

    String update(CaLamViec caLamViec);

    CaLamViec insert(CaLamViec caLamViec);

    void delete(Long id);

}
