package com.junit;
import java.com.exception.InavalidNameException;

@FunctionalInterface
public interface INameValidation {
	
	public boolean namevalidation (String name) throws InavalidNameException;

}
