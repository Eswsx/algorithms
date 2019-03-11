package ComplexFourArithmetic;

import java.util.Scanner;

/*
 * 描述
 * 计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0~9 的一个值。
 * 
 */
public class NumberOfCalculation {
	public static void main(String[] args) {
		System.out.println("Please enter your key:");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("Please enter your number:");
		int number  = sc.nextInt();
		int log = 0;
		int num = 0;
		int a = 0 ;
		for(int i=0;i<=number;i++){
			num = i;
			while(num>=0){
				if(num<10){
					if(num == key)log++;
					break;
				}else{
					a = num%10;
					if(a == key)log++;
					num/=10;
				}
			}
		}
		System.out.println(key + "的个数是：" + log);
	}
}
