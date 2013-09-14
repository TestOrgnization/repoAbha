package com.test;
import javax.jws.WebService;

@WebService
public interface CalculatorIntf {
	public long add(long num1,long num2);
	 
	public long subtract(long num1,long num2);
	 
	public long multiply(long num1,long num2);

}
