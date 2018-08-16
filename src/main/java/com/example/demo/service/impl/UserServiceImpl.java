package com.example.demo.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.IUserService;

@Component
@Service
public class UserServiceImpl implements IUserService {

	@Override
	public String getUserName() {
		return "hello world";
	}

}
