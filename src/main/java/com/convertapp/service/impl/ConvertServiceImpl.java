package com.convertapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convertapp.dao.ConvertDao;
import com.convertapp.response.ConvertResponse;
import com.convertapp.service.ConvertService;

@Service
public class ConvertServiceImpl implements ConvertService {
	
	@Autowired
    private ConvertDao convertDao;

	public ConvertResponse convertWeight(String from, String to, String value) {
			return convertDao.convertWeight(from, to, value);
	}

}
