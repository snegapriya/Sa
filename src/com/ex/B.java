package com.ex;

public interface B extends A{

	void middlename();
	

	
	@Override
	default void firstname() {

		System.out.println("S");
	}
}
