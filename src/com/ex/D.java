package com.ex;

public class D extends C{

	@Override
	public void firstname() {
		// TODO Auto-generated method stub
		super.firstname();
	}
	
	@Override
	public void middlename() {
		// TODO Auto-generated method stub
		super.middlename();
	}
	
	@Override
	public void lastname() {
		// TODO Auto-generated method stub
		super.lastname();
	}
	public static void main(String[] args) {
		
		D d = new D();
		d.firstname();
		d.middlename();
		d.lastname();
	}

}
