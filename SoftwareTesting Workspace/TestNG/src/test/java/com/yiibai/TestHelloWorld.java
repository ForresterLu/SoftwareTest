package com.yiibai;


import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestHelloWorld {
  @Test
  public void testEmailGenerator() {
	  RandomEmailGenerator obj = new RandomEmailGenerator();
	  String email = obj.generate();
	  
	  Assert.assertNotNull(email);
	  Assert.assertEquals(email, "feedback@yiibai.com");
  }
}