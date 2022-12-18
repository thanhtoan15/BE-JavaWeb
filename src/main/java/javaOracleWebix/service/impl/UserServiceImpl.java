package javaOracleWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaOracleWebix.entity.User;
import javaOracleWebix.mapper.UserMapper;
import javaOracleWebix.service.UserService;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
     private UserMapper mapper;
	@Override
	public List<User> getAllUser(){
		return mapper.getAUsers(); 
	}
	
}
