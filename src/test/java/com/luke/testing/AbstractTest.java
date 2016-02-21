package com.luke.testing;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luke.infra.platform.TestContext;


public abstract class AbstractTest {
	
	protected final Map<String, TestContext> testingContext;
	
	@SuppressWarnings("unchecked")
	public AbstractTest(String testName) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		testingContext = (Map<String, TestContext>) context.getBean(testName);
	}
}
