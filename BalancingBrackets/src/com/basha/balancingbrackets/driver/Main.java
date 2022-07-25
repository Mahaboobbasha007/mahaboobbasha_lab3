package com.basha.balancingbrackets.driver;

import com.basha.balancingbrackets.service.BalancingBrackets;

public class Main {

	public static void main(String[] args) {
		BalancingBrackets balancingBrackets=new BalancingBrackets();
		String brackets="([[{}]])";
		Boolean result;
		result=balancingBrackets.checkingBrackets(brackets);
		if (result) {
			System.out.println("The entered Strings are balanced");
		}
		else {
			System.out.println("The entered Strings are not balanced");
		}

	}

}
