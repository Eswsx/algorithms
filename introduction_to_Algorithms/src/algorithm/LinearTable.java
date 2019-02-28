package algorithm;

import java.util.Scanner;

public class LinearTable {
	public static class Node{
		private int value = 0;
		private Node next;
		public void setValue(int value){
			this.value = value;
		}
		public int getValue(){
			return value;
		}
		public void setNext(Node next){
			this.next = next;
		}
		public Node getNext(){
			return this.next;
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node();
		Node tail = new Node();
		head.setValue(0);
		head.setNext(tail);
		tail.setValue(0);
		tail.setNext(null);
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int number = sc.nextInt();
		while(number != -1){
			Node next = new Node();
			next.setValue(number);
			tail.setNext(next);
			next.setNext(null);
			number = sc.nextInt();
		}
		System.out.println(tail.getValue());
		sc.close();
	}
}
