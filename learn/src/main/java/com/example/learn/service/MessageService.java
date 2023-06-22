package com.example.learn.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {
    public String getMessage(){
        return "This page is ready for you";
    }
}