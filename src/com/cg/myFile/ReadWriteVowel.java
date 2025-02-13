package com.cg.myFile;

import java.io.BufferedInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteVowel {

	public static void main(String[] args) {
		File file=new File("C://Users//SHALPATE//a.txt");
		File f=new File("C://Users//SHALPATE//myfile.txt");
		
		try (FileInputStream fis=new FileInputStream(file); BufferedInputStream bis=new BufferedInputStream(fis);FileOutputStream fos=new FileOutputStream(f))
			 
			{
	
//			= (char)bis.read();
		      
		        
		        while(bis.available()>0) {
		        	int c1=bis.read();
		        	if((char)c1=='a'||(char)c1=='e'||(char)c1=='i'||(char)c1=='o'||(char)c1=='u') {
		        		if(!f.exists())
		        		{
		        			f.createNewFile();
		        		}
		        		
		        	fos.write((char)c1);
		        	fos.flush();
		     
		        }
		        }
		        System.out.println("File has been written successfully.");
		}catch
			(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			System.out.println("File not found"+e.getMessage());
			e.printStackTrace();
	
	}
		}
	
	}

