package com.junit;
import java.com.exception.InavalidPasswordException;

@FunctionalInterface
public interface IPassWordValidation {

	public boolean PassWordValidation (String PassWord) throws InavalidPasswordException;
	
}
