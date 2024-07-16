package com.study.potshop.controller;

import com.study.potshop.dto.UsersDto;
import com.study.potshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody UsersDto req) {

        UsersDto usersDto = userService.create(req);

        return ResponseEntity.ok(usersDto);
    }
}
