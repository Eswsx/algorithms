package ComplexFourArithmetic;

import java.util.Scanner;

/*
 * ����
 * �������� k �� 0 �� n �еĳ��ֵĴ�����k ������ 0~9 ��һ��ֵ��
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
		System.out.println(key + "�ĸ����ǣ�" + log);
	}
}
