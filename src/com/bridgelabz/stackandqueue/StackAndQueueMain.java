package com.bridgelabz.stackandqueue;

public class StackAndQueueMain{
	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<Integer>();
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		System.out.println(stack.peek());
		stack.pop();
		
	}

}