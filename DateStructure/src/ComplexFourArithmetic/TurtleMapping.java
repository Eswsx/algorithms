package ComplexFourArithmetic;
import javax.swing.JFrame;

public class TurtleMapping {
	public static class window extends JFrame{
		public void StartTurrtleGraphics(){
			this.setTitle("Turtle mapping");//����
			this.setSize(600,600);//���ڴ�С
			this.setLocation(200,150);//���ô���λ��
			this.setVisible(true);
			
		}
	}
	public static void main(String[] args) {
		window w = new window();
		w.StartTurrtleGraphics();
	}
}
