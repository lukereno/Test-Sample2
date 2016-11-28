package com.luke.testing.datareader.serviceA.getApi;

import com.luke.testing.datareader.AbstractDataReader;


public class SampleReader extends AbstractDataReader {
	
	private String description;
	private String testMethod;
	private String result;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTestMethod() {
		return testMethod;
	}
	public void setTestMethod(String testMethod) {
		this.testMethod = testMethod;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
