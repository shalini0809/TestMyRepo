package com.cg.bank.inter;

public class IciciBank implements RbiInterface {
		double interest;
	@Override
	public double getInterest() {
		  interest=amount+(amount*0.7);
		return interest;
	}

}
