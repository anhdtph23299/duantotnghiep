package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.BienTheEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BienTheRepository extends JpaRepository<BienTheEntity,Long> {
}
