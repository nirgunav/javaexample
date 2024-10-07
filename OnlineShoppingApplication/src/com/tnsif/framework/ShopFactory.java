package com.tnsif.framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAccount(int AccNo,String accNm,float charges,boolean isprime);
	public NormalAcc getNewNormalAccount(int AccNo,String accNm,float charges,float deliverycharges);
}


