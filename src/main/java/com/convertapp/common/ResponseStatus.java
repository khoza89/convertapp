package com.convertapp.common;

public enum ResponseStatus {
	SUCCESS, // successful response
	UNAUTHORIZED, // not authorized to perform this action
	INTERNAL_ERROR, // something went wrong
	BUSINESS_ERROR, // business rule violated
	VALIDATION_ERROR, // invalid input
	PROXY_ERROR; // error propagated from 3rd party
}
