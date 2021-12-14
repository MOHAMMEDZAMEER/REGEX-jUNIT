package com.junit;
import java.com.exception.InvalidEmailException;

@FunctionalInterface
public interface IEmailValidation {

	public boolean emailValidation(String email) throws InvalidEmailException;

}
