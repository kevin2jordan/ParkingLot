package com.learn.parkinglot.controller;

import com.learn.parkinglot.model.account.Admin;
import com.learn.parkinglot.repository.AdminRepository;
import com.learn.parkinglot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin admin) {

        return adminService.addAdmin(admin);
    }

    @GetMapping("/{email}")
    public Admin getAdminByEmail(@PathVariable("email") String email) {
        return adminService.getAdminByEmail(email);
    }
}
