package com.luke.testing.datareader;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AbstractDataReader {
	protected String testId;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	@Override
	public String toString() {

		final ReflectionToStringBuilder reflectionToStringBuilder = new ReflectionToStringBuilder(
				this);
		reflectionToStringBuilder
				.setExcludeFieldNames(new String[] { "testId" });
		reflectionToStringBuilder.append("testId", testId);
		return reflectionToStringBuilder.toString();
	}
}
