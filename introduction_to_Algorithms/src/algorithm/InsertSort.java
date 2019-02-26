package algorithm;

public class InsertSort {
	public static void main(String[] args) {
		double[] MyList= new double[]{5,2,4,6,1,3}; 
		sort(MyList);
		for(int i=0;i<6;i++){
			System.out.println(MyList[i]);
			}
		}
	
	public static void sort(double[] array){
		for(int i=0;i<6;i++){
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
}
