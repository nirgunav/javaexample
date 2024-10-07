package com.tnsif.application;
import com.tnsif.framework.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc {
public MMCurrentAcc(int accNo,String accNm,float accBal,float isSalaried) {
	super(accNo,accNm,accBal,isSalaried);
}

@Override
public String toString() {
	return "MMCurrentAcc [toString()=" + super.toString() + ", getCreditlimit()=" + getCreditlimit() + ", getAccNo()="
			+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}
}



