package javaOracleWebix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaOracleWebix.service.UserService;
import lombok.extern.slf4j.Slf4j;


public class demo {
	public String test(){
        return "Thanh Toan";
    }
}
