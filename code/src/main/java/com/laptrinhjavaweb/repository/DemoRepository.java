package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Demo,Long> {
}
