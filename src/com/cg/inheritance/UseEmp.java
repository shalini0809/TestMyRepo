package com.cg.inheritance;

public class UseEmp {
	
		static 
		{
			System.out.println("Hello Capgemini");
		}
	public static void main(String[] args)
	{
		System.out.println(Employee.company);
		// TODO Auto-generated method stub
       FullTimeEmp ft=new FullTimeEmp(101, "Neil", 50057);
       ft.display();
       System.out.println(ft);
       
       PartTimeEmp pt=new PartTimeEmp(201, "Rakesh", 20040);
       pt.display();
       System.out.println(pt);
		
		Employee ft1=new FullTimeEmp(301, "Rajat", 30002);
		ft1.display();
		Employee pt1=new PartTimeEmp(401, "ISHITA", 28777);
		pt1.display();
		
		Employee e1=new Employee("Khushi");
		Employee e2=new Employee("Rishika");
		
		e1.display();
		e2.display();
		
		Employee.show();
	}

}
