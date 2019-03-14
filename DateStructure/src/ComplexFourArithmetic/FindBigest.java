package ComplexFourArithmetic;
/*
 * 在数组中找到第 k 大的元素。
 */
public class FindBigest {
	public static void main(String[] args) {
		int[] a = new int[]{9,3,2,4,8};
		int k = 3;
		a = sort(a);
		for(int i=0;i<a.length;i++){	
		System.out.print(a[i]);}
//		System.out.println(a[k-1]);
	}
	public static int[] sort(int[] a){
		for(int i=0;i<a.length;i++){
			int b=0;
			for(int j=0;j<i;j++){
				if(a[i]>a[j]){
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		return a;
	}
}
