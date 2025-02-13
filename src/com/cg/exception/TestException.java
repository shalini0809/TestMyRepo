package com.cg.exception;

public class TestException {

	public static void main(String[] args) {
//		
		try {
			int[] a= {10,20,30};
			System.exit(1);
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
//	        System.out.println(a[3] );
			int x=10/2;
			System.out.println(x);
			String s="null";
			System.out.println(s.length());}
//		catch(Exception e){
//			System.out.println("Something went wrong.");
//		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
				System.out.println("Something went wrong.");
			}
//		catch(ArithmeticException e) {
//			System.out.println("Value undefined"+e.getMessage());
//		}
//		catch(NullPointerException e){
//			System.out.println("Value is pointing to Null "+e.getMessage());
//		}
		finally {
			System.out.println("This will always execute");
		}
//		
		
		}
	}
