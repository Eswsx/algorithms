package ComplexFourArithmetic;
import javax.swing.JFrame;

public class TurtleMapping {
	public static class window extends JFrame{
		public void StartTurrtleGraphics(){
			this.setTitle("Turtle mapping");//标题
			this.setSize(600,600);//窗口大小
			this.setLocation(200,150);//设置窗口位置
			this.setVisible(true);
			
		}
	}
	public static void main(String[] args) {
		window w = new window();
		w.StartTurrtleGraphics();
	}
}
