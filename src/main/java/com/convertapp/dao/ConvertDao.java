package com.convertapp.dao;

import com.convertapp.response.ConvertResponse;

public interface ConvertDao {
	public ConvertResponse convertWeight(String from, String to, String value);

}
