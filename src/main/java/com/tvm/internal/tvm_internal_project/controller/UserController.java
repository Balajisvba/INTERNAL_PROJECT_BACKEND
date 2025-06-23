//package com.tvm.internal.tvm_internal_project.controller;
//
//import com.tvm.internal.tvm_internal_project.model.User;
//import com.tvm.internal.tvm_internal_project.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//public class UserController {
//
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/newuser")
//    public ResponseEntity<String> createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//
//    @GetMapping("/byemail")
//    public boolean checkUserByEmail(@RequestHeader("Authorization") String authHeader) {
//        return userService.checkUserByEmail(authHeader);
//    }
//
//    @GetMapping("/bymob")
//    public boolean checkUserByMobile(@RequestParam Long mobile, @RequestParam String password) {
//        return userService.checkUserByMobile(mobile, password);
//    }
//}
