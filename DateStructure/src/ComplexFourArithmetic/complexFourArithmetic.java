package ComplexFourArithmetic;

public class complexFourArithmetic {
	public static class PluralObject{
		private double real;
		private double imaginary;
		
		public PluralObject(double real,double imaginary) {
			// TODO �Զ����ɵĹ��캯�����
			this.real = real;
			this.imaginary = imaginary;
		}
		public PluralObject(){
			this.real = 0;
			this.imaginary = 0;
		}
		public double getReal() {
			return real;
		}
		public void setReal(float real) {
			this.real = real;
		}
		public double getImaginary() {
			return imaginary;
		}
		public void setImaginary(float imaginary) {
			this.imaginary = imaginary;
		}
		
	}
	
	public static void OperationAdd(PluralObject a,PluralObject b){
		double real = 0;
		double imaginary = 0;
		real = a.getReal() + b.getReal();
		imaginary = a.getImaginary() + b.getImaginary();
		System.out.println("�ӷ��Ľ����");
		print(real,imaginary);
	}
	public static void OperationLess(PluralObject a,PluralObject b){
		double real = 0;
		double imaginary = 0;
		real = a.getReal() - b.getReal();
		imaginary = a.getImaginary() - b.getImaginary();
		System.out.println("�����Ľ����");
		print(real,imaginary);
	}
	public static void OperationExcept(PluralObject a,PluralObject b){
		double real = 0;
		double imaginary = 0;
		real=(a.getReal()*b.getReal()+a.getImaginary()*b.getImaginary())/(b.getReal()*b.getReal()+b.getImaginary()*b.getImaginary());
		imaginary=(a.getImaginary()*b.getReal()-a.getReal()*b.getImaginary())/(b.getReal()*b.getReal()+b.getImaginary()*b.getImaginary());
		System.out.println("�����Ľ����");
		print(real,imaginary);
	}
	public static void OperationMul(PluralObject a,PluralObject b){
			double real = 0;
			double imaginary = 0;
			double mid = 0;
			real = a.getReal()*b.getReal()-a.getImaginary()*b.getImaginary();
			imaginary = a.getImaginary()*b.getReal()+b.getImaginary()*a.getReal();
			System.out.println("�˷��Ľ����");
			print(real,imaginary);
		}
	
	public static void main(String[] args) {
		PluralObject a1 = new PluralObject(7,1);
		PluralObject b1 = new PluralObject(3,4);
		OperationAdd(a1,b1);
		OperationLess(a1,b1);
		OperationMul(a1,b1);
		OperationExcept(a1,b1);
	}
	public static void print(double real,double imaginary){
		if(imaginary > 0){
			if(real != 0){
				System.out.println(real + "+i" + imaginary);
			}else{
				System.out.println("i" + imaginary);
			}
		}else if(imaginary == 0){
			System.out.println(real);
		}else{
			if(real != 0){
				System.out.println(real + "-i" + (-imaginary));
			}else{
				System.out.println("-i" + (-imaginary));
			}
		}
	}
	
}
