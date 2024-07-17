package com.study.potshop.controller;

import com.study.potshop.dto.UsersDto;
import com.study.potshop.service.UserSecurityService;
import com.study.potshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserSecurityService userSecurityService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsersDto usersDto) {
        UserDetails userDetails = userSecurityService.loadUserByUsername(usersDto.getUsername());

        return ResponseEntity.ok(userDetails);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody UsersDto req) {

        UsersDto usersDto = userService.create(req);

        return ResponseEntity.ok(usersDto);
    }

}
