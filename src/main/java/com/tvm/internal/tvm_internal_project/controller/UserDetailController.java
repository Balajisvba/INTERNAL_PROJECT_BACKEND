package com.tvm.internal.tvm_internal_project.controller;

import com.tvm.internal.tvm_internal_project.model.UserDetail;
import com.tvm.internal.tvm_internal_project.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserDetailController {


    @Autowired
    private UserDetailService userDetailService;

    @PostMapping("/newuser")
    public ResponseEntity<String> createUser(@RequestBody UserDetail user) {
        return userDetailService.createUser(user);
    }

    @GetMapping("/byemail")
    public boolean checkUserByEmail(@RequestParam String email, @RequestParam String password) {
        return userDetailService.checkUserByEmail(email, password);
    }

    @GetMapping("/bymob")
    public boolean checkUserByMobile(@RequestParam Long mobile, @RequestParam String password) {
        return userDetailService.checkUserByMobile(mobile, password);
    }
}
