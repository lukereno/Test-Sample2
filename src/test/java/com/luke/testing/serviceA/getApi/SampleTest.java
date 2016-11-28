package com.luke.testing.serviceA.getApi;

import java.util.Iterator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.luke.testing.AbstractTest;
import com.luke.testing.datareader.serviceA.getApi.SampleReader;

public class SampleTest extends AbstractTest {
	
	public SampleTest() {
		super(SampleTest.class.getName());
	}
	
	@BeforeClass
	public void doSetup() {
		System.out.println("Doing test setup");
		//start services
		//setup db
	}
	
	
	@DataProvider(name="testMethod1Provider", parallel=true)
	public Iterator<Object[]> getTestMethod1Provider() {
		return testingContext.get("testMethod1").getDataReader();
	}
	
	@Test(dataProvider="testMethod1Provider")
	public void testMethod1(SampleReader dro) {
		System.out.println(dro.toString());
		//prepare request
		//send request (to api)
		//validate response
		//validate database
		//etc
	}
	
	
//	@DataProvider(name="testMethod2Provider", parallel=true)
//	public Iterator<Object[]> getParallelDataReader() {
//		return testingContext.get("testMethod2").getDataReader();
//	}
//	
//	@Test(dataProvider="testMethod2Provider")
//	public void testMethod2(SampleReader dro) {
//		System.out.println(dro.toString());
//	}
	
	
	@AfterClass
	public void doCleanup() {
		System.out.println("Doing test cleanup");
		//stop services
		//cleanup db
	}
}
