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
		for(int i=0;i<=number;i++){
			num = i;
			System.out.println("num1:"+num);
			while(num>0){
				if(num==key || (num!=key*10&&num/10==key) ){
					log++;
					System.out.println("num2:"+num);
					System.out.println("log:"+log);
					System.out.println("-------");
				}
				num/=10;
				System.out.println("num3:"+num);
			}
		}
		System.out.println(key + "�ĸ����ǣ�" + log);
	}
}
