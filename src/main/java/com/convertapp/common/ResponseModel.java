package com.convertapp.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResponseModel implements Serializable {

	private static final long serialVersionUID = 2351782725624685876L;
	private Date responseTime = new Date();
	private ResponseStatus status = ResponseStatus.SUCCESS;
	private List<ErrorModel> errors;

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	public List<ErrorModel> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorModel> errors) {
		this.errors = errors;
	}

	public void addError(ErrorModel error) {
		if (errors == null) {
			errors = new ArrayList<ErrorModel>();
		}

		errors.add(error);
	}
	
}
