package com.oxit.decathlon.showCasePolymer.test.services;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oxit.decathlon.showCasePolymer.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/spring/emptyService.xml"})
public class EmptyServiceTest {
	@Autowired
	private UserService emptyService;
	
	@Before
	public void startUp(){
		//If you need to initialize something before start
	}
	
	@Test
	public void test01_(){
		// emptyService.myMethod();
		// Verify 'mock.method(xxx)' as been called 1 and only 1 time
		//Mockito.verify(mock, Mockito.times(1)).method(xxx);
		Assert.assertTrue(true);
	}
}
