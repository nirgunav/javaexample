package com.tnsif.framework;

public abstract class CurrentAcc extends BankAcc {
	private float creditlimit;
	public void withdraw(float accBal) {
	

}
	public CurrentAcc(int accNo, String accNm, float accBal, float creditlimit) {
		super(accNo, accNm, accBal);
		this.creditlimit = creditlimit;
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditlimit=" + creditlimit + "]";
	}
	public float getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(float creditlimit) {
		this.creditlimit = creditlimit;
	}
}
	
 
