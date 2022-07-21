package com.example.timedpushquartz.controller;



import com.example.timedpushquartz.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试springboot整合nacos
 * @author: lvxw
 * @date: 2022/7/21 9:13
 */
@Slf4j
@RestController
public class TestController {


    @Autowired
    private Student student;

    @GetMapping("test")
    public String test(){
        log.info(String.valueOf(student));
        return student.getName();
    }

}
