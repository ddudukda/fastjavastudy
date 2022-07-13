package ch05;

import ch03.MyListNode;

import ch03.MyLinkedList;

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue{

	MyListNode front;
	MyListNode rear;
		
	
	public MyLinkedQueue()
	{
		front = null;
		rear = null;
	}
	
	@Override
	public void enQueue(String data){
		MyListNode newNode;
		if(isEmpty())  //처음 항목
		{
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else
		{
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}
	
	@Override
	public String deQueue(){
		
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData();
		front = front.next;
		
		if( front == null ){  // 마지막 항목
			rear = null;
		}
		return data;
	}
	
	
	public void printQueue(){
		printAll();
	}
}

