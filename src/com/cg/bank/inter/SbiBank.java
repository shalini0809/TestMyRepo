package com.cg.bank.inter;

public class SbiBank implements RbiInterface, CheckInter {
  
  double interest;
  public double getInterest() {
	  interest=amount+(amount*0.8);
	  return interest;
  }
@Override
public String prntWord() {
	System.out.println(word);
	return null;
}
}
