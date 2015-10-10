package com.alexgao.dubbo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alexgao.dubbo.service.MyService;

@Service
public class MyServiceImpl implements MyService {
	
	private static final Logger log = LoggerFactory.getLogger(MyServiceImpl.class);

	public void hi() {
		log.info("hi,---------");
	}

}
