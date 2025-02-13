package com.cg.myFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObjectInAFile {

	public static void main(String[] args) {
		FileOutputStream fos;
		FileInputStream fis;
		
		Emp emp=new Emp(001, "Neil", 30000);
		
		
       
		try {
			fos = new FileOutputStream("emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			 oos.writeObject(emp);
		        oos.close();
		        fos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		Emp emp1=new Emp(002, "Nitin", 40000);
		try {
			fis = new FileInputStream("emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			emp1=(Emp)ois.readObject();
			ois.readObject();
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
       System.out.println(emp1);
       
	}

}
