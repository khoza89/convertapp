package com.convertapp.service;

import com.convertapp.response.ConvertResponse;

public interface ConvertService {
	public ConvertResponse convertWeight(String from, String to, String value);
}
