package com.greatlearning.bst;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumPairBinarySearchTree {
	
	public SumPairBinarySearchTree(int rootdata) {
		super();
		this.root = new Node(rootdata);
	}
	public static class Node {
		private int data;
		private Node left, right;
		
		public Node (int data) {
			super();
			this.data = data;
		}
		
		public int data() {
			return this.data;
		}
		
		public Node left() {
			return this.left;
		}
		
		public Node right() {
			return this.right;
		}	
			
	}
	
	private Node root;
	public Node root() {
		return this.root;
	}
	public void insert(int data) {
		if (this.root == null) {
			this.root = new Node (data);
		}
		
		insert (this.root, data);
	}
	
	private Node insert(Node node, int data) {
		
		if (node == null) {
			node = new Node(data);
			return node;
		}
		
		if (data < node.data) {
			node.left = insert(node.left(), data);
			
		}
		node.right = insert(node.right(), data);
			
		return node;
	}
	public Set<Integer> findSumPair(int sum){
		Set<Integer> sumpair = new HashSet<>();
		Set<Integer> values = new HashSet<>();
		traversePreOrder(this.root, sum, values, sumpair);
		return sumpair;
	}
	
	private boolean traversePreOrder(Node node, int sum, Set<Integer> collectedvalues, Set<Integer> pair) {
		
		if (node == null) return false;
		int node_data = node.data();
		
		if(collectedvalues.contains(sum - node_data) && !collectedvalues.contains(node_data)) {
			pair.add(sum - node_data);
			pair.add(node_data);
		}
		
		collectedvalues.add(node_data);
		if(node.left() != null && traversePreOrder(node.left(), sum, collectedvalues, pair)) {
			return true;
		}
		
		if(node.right() != null && traversePreOrder(node.right(), sum, collectedvalues, pair)) {
			return true;
		}
		
		return false;
		
	}
	
	public static void main (String args []) {
		
		SumPairBinarySearchTree inp_bst = new SumPairBinarySearchTree(40);
		inp_bst.insert(20);
		inp_bst.insert(10);
		inp_bst.insert(30);
		inp_bst.insert(60);
		inp_bst.insert(50);
		inp_bst.insert(70);
		
		int sum = 0;
		try(Scanner input = new Scanner(System.in);){
			System.out.println("Please enter the desired sum :");
			sum = input.nextInt();
		}
		
		Set<Integer> sumpair = inp_bst.findSumPair(sum);
		
		if (sumpair.isEmpty()) {
			System.out.println("No matching pair found!");
		}
		else {
			System.out.println("Pair is" + sumpair);
		}
	}
	
}
