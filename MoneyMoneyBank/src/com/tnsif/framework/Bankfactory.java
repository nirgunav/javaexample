package com.tnsif.framework;

public interface Bankfactory {
	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean issalaried);
	public CurrentAcc getNewCurrentAccount(int AccNo,String AccNm,float accBal,double creditlimit);

}
