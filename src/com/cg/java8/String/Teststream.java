package com.cg.java8.String;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teststream {

	public static void main(String[] args) {
		
		Stream<Integer> st=Stream.of(10,20,30,40,50);              //case-1:
		st.forEach((x)->{System.out.println(x);});
		
		Stream<Integer> stArr=Stream.of(new Integer[] {100,200,300});
		stArr.forEach((x)->{System.out.println(x);});
		
		List<String> stList=new ArrayList<>();                         //print list using stream
		stList.add("one");
		stList.add("two");
		stList.add("three");
		stList.add("two");
		stList.add("stringgg");
		stList.add("carting");
		stList.add("carting");
		stList.add("only");
		stList.add("only");
		
		Stream<String> streamList=stList.stream();
		streamList.forEach((x)->{System.out.println(x);});
		
		
		stList.stream()
//		.filter(x->x.startsWith("t"))
		.sorted()
		.map(String::toUpperCase)
		
		.forEach(System.out::println);
		
		List<String> nameUpperList=stList.stream()
		.filter(x->x.startsWith("t"))
		.sorted()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		System.out.println(nameUpperList);
		
		
		boolean matchedResult=stList.stream()
		.anyMatch((s)->s.startsWith("o"));
		System.out.println(matchedResult);
		
		
		boolean matchedResult1=stList.stream()
				.allMatch((s)->s.startsWith("t"));
				System.out.println(matchedResult1);
				
				boolean matchedResult2=stList.stream()
						.noneMatch((s)->s.startsWith("z"));
						System.out.println(matchedResult2);

  long matchedResult3=stList.stream()
		 
  .filter((s)->s.startsWith("t"))
  .count();
	System.out.println(matchedResult3);		
	
	
	
	          stList.stream()
			  .filter((s)->s.startsWith("t")).limit(3)
			  
			.forEach(System.out::println);	
	 
			stList.stream()
			.filter((s)->s.startsWith("o")).distinct()
			  
			.forEach(System.out::println);	
			
			
			
			
	}

}
