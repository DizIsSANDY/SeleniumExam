package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11_ITestListener {

	@Test(priority=1)

	public void method1()
	{
		Assert.assertTrue(true);
	}
	
	@Test(retryAnalyzer=com.qa.listerner.RetryAnalyzer.class)
	public void method2()
	{
		Assert.assertTrue(false);

	}
}
