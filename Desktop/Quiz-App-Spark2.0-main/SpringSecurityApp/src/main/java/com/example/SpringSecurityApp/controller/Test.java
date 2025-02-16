package com.example.SpringSecurityApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
//    @GetMapping("/start-quiz")
//    public String getName(){
//        return "start-quiz";
//    }
    @GetMapping("/update")
    public String update(){
        return "upadate balance---";
    }
    @GetMapping("/contactus")
    public String contactus(){
        return"123143434324";
    }
    @GetMapping("/checkbalance")
    public String checkbalance(){
        return "balance succuss full checked";
    }
    @GetMapping("/transfer")
    public String transfer(){
        return"transfer succuss fully....";
    }
}
