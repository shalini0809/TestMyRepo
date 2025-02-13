package com.cg.assignment.CollectionsPractice;

public class Library {
	
		String bName;
		int checkouts;
		
		public Library(String bName, int checkouts){
			this.bName=bName;
			this.checkouts=checkouts;
		}

		@Override
		public String toString() {
			return "Library [bName=" + bName + ", checkouts=" + checkouts + "]";
		}
		
		
	}

