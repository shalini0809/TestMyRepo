package com.cg.assignment.maps;

public class Burger implements Comparable<Burger>{
    float size;
    int buegerId;
    float price;
    String type;
    
    
	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Burger(float size, int buegerId, float price, String type) {
		super();
		this.size = size;
		this.buegerId = buegerId;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Burger [size=" + size + ", buegerId=" + buegerId + ", price=" + price + ", type=" + type + "]";
	}


	@Override
	public int compareTo(Burger b) {
		if(this.price==b.price) 
			return 0;
			else 
				if(this.price<b.price)
					return -1;
					else
		return 1;
		
	}
    
}
