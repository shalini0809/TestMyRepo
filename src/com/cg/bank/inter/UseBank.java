package com.cg.bank.inter;

public class UseBank {

	public static void main(String[] args) {
		
		RbiInterface sb=new SbiBank();
		System.out.println(sb.getInterest());
		
		RbiInterface ic=new IciciBank();
		System.out.println(ic.getInterest());
		
		RbiInterface ca=new CanaraBank();
		System.out.println(ca.getInterest());
		
        CheckInter sbi=new SbiBank();
        sbi.prntWord();
	}

}
