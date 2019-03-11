package ComplexFourArithmetic;

public class FindBigest2 {
	public static void main(String[] args) {
		int[] a = new int[]{1,3,4,2};
		int k = 1;
		a = sort(a,0,a.length-1);
//		for(int i=0;i<a.length;i++){	
//		System.out.print(a[i]);}
		System.out.println(a[a.length-k]);
	}
	public static int[] sort(int[] a,int left,int right){
		int i, j, t, temp;
		if(left > right)
			return a;
	    temp = a[left]; //temp中存的就是基准数
	    i = left;
	    j = right;
	    while(i != j) { //顺序很重要，要先从右边开始找
	    	while(a[j] >= temp && i < j)
	    		j--;
	    	while(a[i] <= temp && i < j)//再找右边的
	    		i++;       
	    	if(i < j)//交换两个数在数组中的位置
	    	{
	    		t = a[i];
	    		a[i] = a[j];
	    		a[j] = t;
	    	}
	    }
	    //最终将基准数归位
	    a[left] = a[i];
	    a[i] = temp;
	    sort(a,left, i-1);//继续处理左边的，这里是一个递归的过程
	    sort(a,i+1, right);//继续处理右边的 ，这里是一个递归的过程
		
		return a;
	}
}
