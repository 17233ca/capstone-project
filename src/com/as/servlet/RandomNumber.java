package com.as.servlet;

public class RandomNumber {

	public static int randomNumber(int sizeOfTable){
		
		return (int)(Math.random()*sizeOfTable+1);
	}
}
