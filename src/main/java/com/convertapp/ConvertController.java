package com.convertapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.convertapp.response.ConvertResponse;
import com.convertapp.service.ConvertService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/convertapp")
public class ConvertController {
	@Autowired
	ConvertService converterService;

	@RequestMapping(value = "/convert-weight", method = RequestMethod.GET)
    public ConvertResponse convertValue(@RequestParam("from") String from, @RequestParam("to") String to ,@RequestParam("value") String value ) {
		return converterService.convertWeight(from, to, value);
    }
}
