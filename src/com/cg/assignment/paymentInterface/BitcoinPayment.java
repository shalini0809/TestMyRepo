package com.cg.assignment.paymentInterface;

 class BitcoinPayment implements PaymentMethod {
	private String walletAddress;
    private String transactionHash;

    public BitcoinPayment(String walletAddress, String transactionHash) {
        this.walletAddress = walletAddress;
        this.transactionHash = transactionHash;
    }


    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }


    public String getPaymentDetails() {
        return "Bitcoin [Wallet Address: " + walletAddress + ", Transaction Hash: " + transactionHash + "]";
    }


	@Override
	public void prcoessPayment(double amount) {
		// TODO Auto-generated method stub
		
	}
}


