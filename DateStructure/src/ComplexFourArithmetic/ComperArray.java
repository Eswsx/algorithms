package ComplexFourArithmetic;

public class ComperArray {
	public static void main(String[] args) {
		int[] number1 = new int[]{3,6,3,8};
		int[] number2 = new int[]{8,3,6,3};
		int[] number = new int[2];
		number = compre(number1,number2);
		for(int i=0;i<2;i++){
			System.out.print(number[i]);
		}
	}
	
	public static int[] compre(int[] a,int[] b){
		int[] number = new int[]{0,0};
		for(int i=0;i<a.length;i++){
			if(a[i]>b[i]){
				number[0]++;
			}else if(a[i]<b[i]){
				number[1]++;
			}
		}
		return number;
	}
	
}
