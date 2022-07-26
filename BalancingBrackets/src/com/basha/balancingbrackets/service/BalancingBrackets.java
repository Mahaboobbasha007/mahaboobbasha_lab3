package com.basha.balancingbrackets.service;

import java.util.Stack;

public class BalancingBrackets {
	public Boolean checkingBrackets(String brackets) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < brackets.length(); i++) {
			char character = brackets.charAt(i);
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;

			}
			if (stack.isEmpty()) {
				return false;

			}
			char c;
			switch (character) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
