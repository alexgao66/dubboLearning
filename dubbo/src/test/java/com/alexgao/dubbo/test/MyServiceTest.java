package com.alexgao.dubbo.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alexgao.dubbo.service.MyService;
import com.alibaba.dubbo.config.annotation.Reference;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration({"/spring-dubbo-test.xml"}) //加载配置文件
@Component
public class MyServiceTest extends TestCase {
	
	@Reference
	MyService myService;
	
	@Test
	public void testHi() {
		myService.hi();
	}
}
