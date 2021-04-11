package com.example.discoveryservice;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
class DiscoveryServiceApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		Assert.notNull(applicationContext, "The application context should not be null");
	}

}
