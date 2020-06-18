package com.dxc.first.app;

public interface RBI 
{
	int ROI=3;
	int MIN_FD_AMOUNT =500;
	int BAL=1000;
	public void openAccount();
	public void deposit(int amount);
	public void withdraw(int amount);
	public void FD(int amount);
	

}
