package com.learn.parkinglot.repository;

import com.learn.parkinglot.model.account.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByEmail(String email);
}
