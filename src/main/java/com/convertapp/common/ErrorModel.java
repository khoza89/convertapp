package com.convertapp.common;

import java.io.Serializable;

public class ErrorModel implements Serializable {

	private static final long serialVersionUID = -4964982129133087478L;

	private String errorMessage = "An error occured";
	private ErrorCode errorCode = ErrorCode.UNKNOWN_ERROR;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

}
