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
	    temp = a[left]; //temp�д�ľ��ǻ�׼��
	    i = left;
	    j = right;
	    while(i != j) { //˳�����Ҫ��Ҫ�ȴ��ұ߿�ʼ��
	    	while(a[j] >= temp && i < j)
	    		j--;
	    	while(a[i] <= temp && i < j)//�����ұߵ�
	    		i++;       
	    	if(i < j)//�����������������е�λ��
	    	{
	    		t = a[i];
	    		a[i] = a[j];
	    		a[j] = t;
	    	}
	    }
	    //���ս���׼����λ
	    a[left] = a[i];
	    a[i] = temp;
	    sort(a,left, i-1);//����������ߵģ�������һ���ݹ�Ĺ���
	    sort(a,i+1, right);//���������ұߵ� ��������һ���ݹ�Ĺ���
		
		return a;
	}
}
