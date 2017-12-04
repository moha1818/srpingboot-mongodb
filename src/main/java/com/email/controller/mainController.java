package com.email.controller;

import com.email.entity.CheckEmailValidator;
import com.email.repository.CheckEmailValidatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class mainController {
    @Autowired
    private CheckEmailValidatorRepository checkEmailValidatorRepository;

    @RequestMapping("/hello")
    @ResponseBody
    public String emailCheck(){
        CheckEmailValidator cev = new CheckEmailValidator();
        cev.setEmail("799845210@qq.com");
        cev.setReplyString("111");
        cev.setStatus(1);
        cev.setCreateTime("2017");
        CheckEmailValidator cev1 = new CheckEmailValidator();
        cev1.setEmail("799845210@qq.com");
        cev1.setReplyString("112");
        cev1.setStatus(1);
        cev1.setCreateTime("2017");
        List<CheckEmailValidator> cevs = new ArrayList<>();
        cevs.add(cev);
        cevs.add(cev1);
        checkEmailValidatorRepository.save(cevs);
        return "hello";
    }
}
