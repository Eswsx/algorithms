package algorithm;

import java.util.Scanner;

public class UseScanner {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = sc.nextLine();
		System.out.println("enter your age:");
		int age = sc.nextInt();
		System.out.println("enter your occuption");
		String occ = sc.next();
		
		System.out.println("name:" + name + "\n" + "age:" + age + "\n" + "occuption:" + occ);
		sc.close();
		
	}
}

