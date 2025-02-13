package com.cg.bank.inter;

public class CanaraBank implements RbiInterface {

   double interest;
	@Override
	public double getInterest() {
		interest=amount+(amount*0.5);
		return interest;
	}

}
