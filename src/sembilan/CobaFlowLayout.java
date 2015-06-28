package sembilan;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


public class CobaFlowLayout extends JFrame {
	
	public CobaFlowLayout() {
		
		super("Coba BorderLayout");
		setLayout(new FlowLayout());
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void createLayout() {
		
		for (int i = 0; i< 20; i++)
			add(new JButton("Tombol " + i));
	}
	
	public static void main (String[] args) {
		new CobaFlowLayout();
	}

}
