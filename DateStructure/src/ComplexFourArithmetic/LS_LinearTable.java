package ComplexFourArithmetic;

public class LS_LinearTable {
	final int MAXSIZE = 10;
	public class List{
		int[] Date = null;
		private int last;
		
		public int getLast() {
			return last;
		}
		public void setLast(int last) {
			this.last = last;
		}
	}
	List MakeEmpty(){
		List Ptrl = new List();
		Ptrl.setLast(-1);
		return Ptrl;
	}
	
	int Find(int x,List Ptrl ){
		int i=0;
		while(i<=Ptrl.getLast() && Ptrl.Date[i]!=x)
			i++;
		if(i>Ptrl.getLast())
			return -1;
		else
			return i;
	}
	void Insert(int x,int i,List Ptrl){
		int j=0;
		if(Ptrl.getLast() == MAXSIZE-1){
			System.out.println("表满");
			return;
		}
		if(i<1 || i>Ptrl.getLast()+2){
			System.out.println("位置不合法");
			return;
		}
		for(j = Ptrl.getLast();j>=i-1;j--)
			Ptrl.Date[j+1] = Ptrl.Date[j];
		Ptrl.Date[i-1] = x;
		Ptrl.setLast(Ptrl.getLast()+1);
		return;
	}
	void Delete(int i,List Ptrl){
		int j =0;
		if(i<1 || i> Ptrl.getLast()+1){
			System.out.println("不存在第"+i+"个元素");
			return;
		}
		for(j=i;j<=Ptrl.getLast();j++){
			Ptrl.Date[j-1] = Ptrl.Date[j];
			Ptrl.setLast(Ptrl.getLast()-1);
			return;
		}
	}
}
