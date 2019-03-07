package ComplexFourArithmetic;

import java.util.Scanner;

public class LinkedListTest {
	public static class LinkList{
		private int value;
		private LinkList next;
		
		public void setValue(int value){
			this.value = value;
		}
		public void setNext(LinkList next){
			this.next = next;
		}
		public int getValue(){
			return value;
		}
		public LinkList getnext(){
			return next;
		}
		
		public LinkList(int value,LinkList next){
			setValue(value);
			setNext(next);
		}
		public LinkList(){
			setValue(0);
			setNext(null);
		}
		
	}
	public static void main(String[] args) {
		LinkList head = new LinkList();
		initialization(head);
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number to Choose your choice :\n");
		System.out.print("1.print\n2.deteleFistOne\n3.deteleAll\n4.modify\n5.add");
		int number = sc.nextInt();
		int i = 0,j = 0;
		switch(number){
		case 1:
			{
			System.out.println("This Link List is:\n");
			print(head);
			}
		case 2:
			{
				System.out.println("which number do you want to delete:\n");
				i = sc.nextInt();
				deleteFistOne(head,i);
				print(head);
			}
		case 3:
			{
				System.out.println("which number do you want to delete:\n");
				i = sc.nextInt();
				deleteAll(head,i);
				print(head);
			}
		case 4:
			{
				System.out.println("which number do you want to modif:\n");
				i = sc.nextInt();
				System.out.println("modif to:\n");
				j = sc.nextInt();
				modify(head,i,j);
				print(head);
			}
		case 5:
			{
				System.out.println("which number do you want to add:\n");
				i = sc.nextInt();
				add(head,i);
				print(head);
			}
		}
	}
	public static void initialization(LinkList head){
		Scanner sc  = new Scanner(System.in);
		int number = 0;
		while(number != -1){
			System.out.println("Please enter your number:");
			number = sc.nextInt();
			add(head,number);
		}
	}
	public static void add(LinkList head,int value){
		while(head.next!=null){
			head = head.next;
		}
		LinkList a = new LinkList(value,null);
		head.next = a;
	}
	public static void deleteAll(LinkList head,int deValue){
		while(head.next!=null){
			head = head.next;
			if(head.value == deValue){
				head.next = head.next.next;
			}
		}
	}
	public static void deleteFistOne(LinkList head,int deValue){
		while(head.next!=null){
			head = head.next;
			if(head.value == deValue){
				head.next = head.next.next;
				break;
			}
		}
	}
	public static void modify(LinkList head,int value,int beValue){
		while(head.next!=null){
			head = head.next;
			if(head.value == beValue){
				head.value = value;
			}
		}
	}
	public static void print(LinkList head){
		do{
			head = head.next;
			if(head.value == -1)break;
			System.out.print(head.value + " ");
		}while(head!=null);
	}
}
