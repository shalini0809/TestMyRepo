package com.cg.basic.array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] Score=new int[5];
      
      Score[0]=10;
      Score[1]=35;
      Score[2]=47;
      Score[3]=87;
      Score[4]=86;
     maxValue(Score);
	}
      public static void maxValue(int[] Score) {
    	  int min=Score[0];
    	  int max=Score[0];
    	  for(int i=0; i<Score.length;i++) {
    	  if(min>Score[i]) {
    		  min=Score[i];
    	  }
    	  if(max<Score[i]) {
    		  max=Score[i];
    	  }
    	  }
    	  System.out.println("Max is :"+max);
    	  
      
    	  

}
}