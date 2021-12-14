package com.junit;
import java.com.exception.InvalidPhoneNumberException;

@FunctionalInterface
public interface IPhoneValidation {

	public boolean PhoneValidation(String phone) throws InvalidPhoneNumberException;
	
}
