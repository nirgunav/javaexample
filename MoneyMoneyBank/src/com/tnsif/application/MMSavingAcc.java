package com.tnsif.application;
import com.tnsif.framework.SavingAcc;
import com.tnsif.framework.CurrentAcc;


public class MMSavingAcc extends SavingAcc {
	public MMSavingAcc(int accNo,String accNm,float accBal,boolean issalaried) {
	    super(accNo ,accNm, accBal, issalaried);
	}
	  public void withdraw(float accBal) {
		System.out.println("dear normal savings account user,your withdrawal accBal is:"+getAccBal());

	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	}


