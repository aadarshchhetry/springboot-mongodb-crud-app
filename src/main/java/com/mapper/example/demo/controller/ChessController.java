package com.mapper.example.demo.controller;

import com.mapper.example.demo.service.ChessService;
import com.mapper.example.demo.service.ChessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChessController {
    @Autowired
    ChessServiceImpl chessService;

    @PostMapping("user/{userid}")
    public void setDetailsUser(@PathVariable("userid") String userId){
        chessService.addUserDetails(userId);
    }
}
