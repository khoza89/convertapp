package com.convertapp.dao.impl;

import org.springframework.stereotype.Repository;

import com.convertapp.common.ErrorCode;
import com.convertapp.common.ErrorModel;
import com.convertapp.common.ResponseStatus;
import com.convertapp.dao.ConvertDao;
import com.convertapp.response.ConvertResponse;

@Repository
public class ConvertDaoImpl implements ConvertDao{

	public ConvertResponse convertWeight(String from, String to, String value) {
		ConvertResponse response = new ConvertResponse();
		String result = null;
		try {
			//weight
			if(from.equalsIgnoreCase("kilogram") && to.equalsIgnoreCase("pound")){
				double res = Double.parseDouble(value) * 2.2046;
				result =  String.valueOf(res) + " pound";
				response.setValue(result);
			}
			
			if(from.equalsIgnoreCase("pound") && to.equalsIgnoreCase("kilogram")){
				double res = Double.parseDouble(value) * 0.454;
				result =  String.valueOf(res)+ " kilogram";
				response.setValue(result);
			}
			//distance
			if(from.equalsIgnoreCase("kilometer") && to.equalsIgnoreCase("mile")){
				double res = Double.parseDouble(value) * 0.62;
				result =  String.valueOf(res) + " mile";
				response.setValue(result);
			}
			
			if(from.equalsIgnoreCase("mile") && to.equalsIgnoreCase("kilometer")){
				double res = Double.parseDouble(value) * 1.61;
				result =  String.valueOf(res) +" kilometer";
				response.setValue(result);
			}
			//fluid
			if(from.equalsIgnoreCase("liter") && to.equalsIgnoreCase("gallon")){
				double res = Double.parseDouble(value) * 0.264;
				result =  String.valueOf(res)+ " gallon";
				response.setValue(result);
			}
			
			if(from.equalsIgnoreCase("gallon") && to.equalsIgnoreCase("liter")){
				double res = Double.parseDouble(value) * 3.785;
				result =  String.valueOf(res) +" liter";
				response.setValue(result);
			}
		} catch (NumberFormatException ex) {
			loadError(response, "error converting values.",
					ResponseStatus.VALIDATION_ERROR,
					ErrorCode.VALIDATION_FAILURE);
		}
        
		 return response;
	}
	
	private void loadError(ConvertResponse response,
			String errorMessage, ResponseStatus responseStatus,
			ErrorCode errorCode) {
		ErrorModel error = new ErrorModel();
		error.setErrorCode(errorCode);
		error.setErrorMessage(errorMessage);
		response.addError(error);
	}

}
