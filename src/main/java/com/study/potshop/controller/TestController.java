package com.study.potshop.controller;

import com.study.potshop.dto.TestDto;
import com.study.potshop.entity.TestEntity;
import com.study.potshop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/test")
    @ResponseBody
    public String insertName(@RequestBody TestDto req) {

        TestDto testDto = new TestDto(req.getName());
        testService.insertName(testDto);

        return "입력완료";


    }
}
