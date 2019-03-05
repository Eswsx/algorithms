package ComplexFourArithmetic;

public class complexFourArithmetic {
	public static class PluralObject{
		private double real;
		private double imaginary;
		
		public PluralObject(double real,double imaginary) {
			// TODO 自动生成的构造函数存根
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
	public void OperationMul(PluralObject a,PluralObject b){
		
		}
	
	public static void main(String[] args) {
		PluralObject a1 = new PluralObject(7.7,-8);
		PluralObject b1 = new PluralObject(-7.7,0);
		OperationAdd(a1,b1);
	}
	
}
