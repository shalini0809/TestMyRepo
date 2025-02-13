package com.cg.exception;

public class TestThrowException {

	public static void main(String[] args) {
		
		try {
			division();
			
		}catch(ArithmeticException e) {
			System.out.println("exception caught " +e.getMessage());
		}
    
	}
	public static void division() throws ArithmeticException{
		int a=0;
		if(a==0) {
			throw new ArithmeticException("Something went wrong");
		}else {
			System.out.println(10/a);
		}
	}

}
