import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
	public JFrame f;
	public JPanel p;
	
	public JButton b1 = new JButton("R");
	public JButton b2= new JButton("R'");
	public JButton b3= new JButton("L");
	public JButton b4= new JButton("L'");
	public JButton b5= new JButton("U");
	public JButton b6= new JButton("U'");
	public JButton b7= new JButton("D");
	public JButton b8= new JButton("D'");
	public JButton b9 = new JButton("F");
	public JButton b10= new JButton("F'");
	public JButton b11= new JButton("B");
	public JButton b12= new JButton("B'");
	public JButton b13= new JButton("M");
	public JButton b14= new JButton("M'");
	public JButton b15= new JButton("E");
	public JButton b16= new JButton("E'");
	public JButton b17= new JButton("S");
	public JButton b18= new JButton("S'");
	public JButton b19= new JButton("X");
	public JButton b20= new JButton("X'");
	public JButton b21= new JButton("Y");
	public JButton b22= new JButton("Y'");
	public JButton b23= new JButton("Z");
	public JButton b24= new JButton("Z'");
	
	public GUI() {
		
		gui();
		
	}
	
	public void gui() {
		f = new JFrame("pipo");
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setBackground(Color.YELLOW);	
		
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.R(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Rn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        
        
        p.add(b1);
        p.add(b2);
		f.add(p);	
	}

	


}
