package snakegame;
import java.awt.Color;
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          JFrame f = new JFrame();
          f.setTitle("SnakeGame");
          f.setBounds(10,10,905,700);
          f.setResizable(false);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setBackground(Color.BLACK);
          f.setVisible(true);

          
       Gameplay gameplay = new Gameplay();
       f.add(gameplay);
          
	}
	
}


