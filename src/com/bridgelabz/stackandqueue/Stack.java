package com.bridgelabz.stackandqueue;


public class Stack<T> {
	LinkedList<T> myLinkedList;
	
	public Stack() {
		this.myLinkedList = new LinkedList<>();
	}
	
	public void push(Node<T> data) {
		myLinkedList.add(data);
	}
	public void printStack() {
		myLinkedList.printMyNodes();
	}
	
	public T peek() {
		return myLinkedList.head.getData();
	}
	
	public void pop() {
		myLinkedList.popAll();
	}
	
}