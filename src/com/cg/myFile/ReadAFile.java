package com.cg.myFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {
//		
//		File file=new File("C://Users//SHALPATE//a.txt");
//		BufferedInputStream bis=null;
//		FileInputStream fis=null;
//		try {
//			 fis=new FileInputStream(file);
//		        bis=new BufferedInputStream(fis);
//		        while(bis.available()>0) {
//		        	System.out.print((char)bis.read());
//		        }
//       
//		}catch
//			(FileNotFoundException e) {
//			e.printStackTrace();
//			
//		}catch(IOException e) {
//			System.out.println("File not found"+e.getMessage());
//			e.printStackTrace();
//		
//     
//        }
//		
//		finally {
//			
//				try {
//					if(bis!=null && fis!=null) {
//						fis.close();
//						bis.close();
//					}
//				}catch(IOException e) {
//					e.printStackTrace();
//				}
//				
//			
//		}
		
		

		File file=new File("C://Users//SHALPATE//a.txt");
		BufferedInputStream bis=null;
		
		try (FileInputStream fis=new FileInputStream(file)){
			 
		        bis=new BufferedInputStream(fis);
		        while(bis.available()>0) {
		        	System.out.print((char)bis.read());
		        }
       
		}catch
			(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			System.out.println("File not found"+e.getMessage());
			e.printStackTrace();
		
     
        }
		
			
	}

}
