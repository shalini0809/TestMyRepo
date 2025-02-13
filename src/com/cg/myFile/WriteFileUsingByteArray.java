package com.cg.myFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileUsingByteArray {

	public static void main(String[] args) {
		
//		FileOutputStream fos=null;
//		File f;
//		String str="This is my test for writing file using Byte Array.";
//		
//        try {
//        	f=new File("C://Users//SHALPATE//myfile.txt");
//			fos=new FileOutputStream(f);
//			if(!f.exists()) {
//				f.createNewFile();
//			}
//			byte[] bArray=str.getBytes();
//			fos.write(bArray);
//			fos.flush();
//			System.out.println("File has been written succesfully.");
//			
//		}
//        catch (FileNotFoundException e) 
//        {
//			
//			e.printStackTrace();
//			
//		} 
//        catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//        finally {
//        	if(fos!=null) {
//        		try {
//					fos.close();
//				} catch (IOException e) {
//					
//					e.printStackTrace();
//				}
//        	}
//        }
//        
		
//		using try with resources
		
		File f=new File("C://Users//SHALPATE//myfile.txt");
		String str="This is my test for writing file using Byte Array.";
		
        try(FileOutputStream fos=new FileOutputStream(f)){
			f=new File("C://Users//SHALPATE//myfile.txt");
        	
			if(!f.exists()) {
				f.createNewFile();
			}
			byte[] bArray=str.getBytes();
			fos.write(bArray);
			fos.flush();
			System.out.println("File has been written succesfully.");
        
		}
        catch (FileNotFoundException e) 
        {
			
			e.printStackTrace();
			
		} 
        catch (IOException e) {
			
			e.printStackTrace();
		}
        
		
	}

}
