package com.convertapp.common;

public enum ErrorCode {
	UNKNOWN_ERROR("E001"), BUSINESS_RULE_VIOLATION("E003"), VALIDATION_FAILURE(
			"E004"), UNAUTHORIZED("E401"), PROXY_ERROR("E005"), INTERNAL_ERROR("E006");

	private final String text;

	/**
	 * @param text
	 */
	private ErrorCode(final String text) {
		this.text = text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return text;
	}
}
