package sembilan;

import javax.swing.JFrame;
import javax.swing.JButton;

public class CobaExtendsGUI extends JFrame{
	
	JButton button;
	
	public CobaExtendsGUI () {
		
		super("Halo");
		button = new JButton("Tes Button");
		add(button);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	static CobaExtendsGUI gui;
	
	public static void main(String[] args) {
		
		gui = new CobaExtendsGUI();
	}
	

}
