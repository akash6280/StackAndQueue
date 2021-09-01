package com.bridgelabz.stackandqueue;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	
	LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(Node<T> newNode) {		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head=newNode;
		}
	}
	
	public void append(Node<T> newNode) {
		if(tail==null)
			this.tail=newNode;
		if(head==null)
			this.head=newNode;
		else
			tail.setNext(newNode);
			tail=newNode;
	}
	
	public void printMyNodes() {
		Node<T>tempNode = head;
		while(tempNode!=null) {
			System.out.print(tempNode.getData()+" ");
			tempNode=tempNode.getNext();
		}
	}
	
	public void insertNodeBetween(Node<T> beforeNode,Node<T> newNode)
	{
		Node<T>tempNode=beforeNode.getNext();
		beforeNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}
	
	public void popFirst() {
		head = head.getNext();
	}
	
	public void popLast() {
		
		Node<T> tempNOde = head;
		while (tempNOde.getNext() != tail) {
			tempNOde = tempNOde.getNext();
		}
		tail = tempNOde;
		tail.setNext(null);
	}
	
	public Node<T> find(T key) {
		Node<T> currentNode = head;
		while (currentNode != null) {
			if (currentNode.getData()==key) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return null;
	}
	
	
	public void deleteNode(T key) {
		Node<T> keyNode = find(key);
		if(keyNode == null) {
			return;
		}
		if(head==keyNode) {
			head=null;
			tail=null;
		} else {
			Node<T> temp = head;
			while(temp.getNext()!= keyNode) {
				temp = temp.getNext();
			}
			temp.setNext(keyNode.getNext());
			if(keyNode == tail) {
				tail = temp;
			}
		}
	}

	
	public int size() {
		int length = 0;
		Node<T> temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		return length;
	}
	
	public void popAll() {
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNext();
		}
	}
	
}