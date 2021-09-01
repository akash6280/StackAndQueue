package com.bridgelabz.stackandqueue;


public class Queue<T> {
	LinkedList<T> myLinkedList;
	
	public  Queue() {
		this.myLinkedList = new LinkedList<>();
	}
	
	public void enqueue(Node<T> data) {
		myLinkedList.append(data);
	}
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
}