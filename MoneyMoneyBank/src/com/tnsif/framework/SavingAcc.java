package com.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float creditLimit2=0;
	
	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getcreditlimit() {
		return creditLimit2;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}

	public SavingAcc(int accNo, String accNm, float accBal, boolean creditlimit2) {
		super(accNo, accNm, accBal);
		this.isSalaried = creditlimit2;
	}
	public void withdraw(float accBal) {
	
	}

	

	
	
}

	
	
	
	
	





