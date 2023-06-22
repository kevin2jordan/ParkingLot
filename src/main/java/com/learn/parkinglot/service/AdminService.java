package com.learn.parkinglot.service;


import com.learn.parkinglot.model.account.Admin;
import com.learn.parkinglot.repository.AdminRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin addAdmin(@NonNull final Admin admin) {
      return adminRepository.save(admin);
    }

    public Admin getAdminByEmail(@NonNull final String email) {
       return adminRepository.findByEmail(email);
    }
}
