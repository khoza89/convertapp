package com.convertapp.common;

import java.util.ArrayList;
import java.util.List;

public class ExceptionResponse extends ResponseModel {

	private static final long serialVersionUID = -7420170835065500364L;

	private List<Object> inputs = new ArrayList<Object>();

	public List<Object> getInputs() {
		return inputs;
	}

	public void setInputs(List<Object> inputs) {
		this.inputs = inputs;
	}

}
