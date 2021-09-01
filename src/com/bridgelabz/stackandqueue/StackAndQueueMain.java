package com.bridgelabz.stackandqueue;

public class StackAndQueueMain{
	public static void main(String[] args) {
	
		Queue<Integer> queue = new Queue<Integer>();
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		
		queue.enqueue(firstNode);
		queue.enqueue(secondNode);
		queue.enqueue(thirdNode);
		queue.printQueue();
		queue.deQueue();
		queue.printQueue();
		
	}

}