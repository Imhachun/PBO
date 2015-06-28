package sembilan;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaLayoutAbsolut extends JFrame {
	
	JButton tombol1;
	JButton tombol2;
	JButton tombol3;
	
	public CobaLayoutAbsolut() {
		
		super("Coba Layout Absolut");
		
		setLayout(null);
		setSize(500, 300);
		createLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void createLayout() {
		
		tombol1 = new JButton("Tombol 1");
		tombol1.setBounds(10, 10, 150, 30);
		tombol2 = new JButton("Tombol 2");
		tombol2.setBounds(100, 50, 100, 30);
		tombol3 = new JButton("Tombol 1");
		tombol3.setBounds(150, 150, 150, 100);
		add((tombol1));
		add((tombol2));
		add((tombol3));
		
		
	}
	
	public static void main(String[] args) {
		new CobaLayoutAbsolut();
	}
	

}
