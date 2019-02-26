package algorithm;

public class InsertSort {
	public static void main(String[] args) {
		double[] MyList= new double[]{5,2,4,-1,6,1,3,4,3,4,6,7}; 
		sort(MyList);
		print(MyList);
		}
	
	public static void sort(double[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<i;j++){
				if(array[i]<array[j]){
					double c = 0;
					c = array[i];
					array[i] = array[j];
					array[j] = c;
				}
			}
		}
	}

	public static void print(double[] MyList){
	for(int i=0;i<MyList.length;i++){
		System.out.println(MyList[i]);
		}
	}
}
