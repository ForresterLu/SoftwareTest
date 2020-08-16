package com.yiibai;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DBConfig {
	@BeforeTest
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@AfterTest
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
}
