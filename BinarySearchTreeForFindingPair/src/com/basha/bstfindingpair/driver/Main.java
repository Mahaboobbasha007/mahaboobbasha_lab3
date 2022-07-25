package com.basha.bstfindingpair.driver;

public class Main {

	public static void main(String[] args) {
		Node root = null;
		PairSum findSP = new PairSum();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);
		int sum = 130;
		findSP.findPairWithGivenSum(root, sum);

	}

}
