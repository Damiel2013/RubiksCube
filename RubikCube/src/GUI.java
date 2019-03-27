import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
	public JFrame f;
	public JPanel p;
	
	public JButton b1 = new JButton("R ");
	public JButton b2= new JButton("R'");
	public JButton b3= new JButton("L ");
	public JButton b4= new JButton("L'");
	public JButton b5= new JButton("U ");
	public JButton b6= new JButton("U'");
	public JButton b7= new JButton("D ");
	public JButton b8= new JButton("D'");
	public JButton b9 = new JButton("F ");
	public JButton b10= new JButton("F'");
	public JButton b11= new JButton("B ");
	public JButton b12= new JButton("B'");
	public JButton b13= new JButton("M ");
	public JButton b14= new JButton("M'");
	public JButton b15= new JButton("E ");
	public JButton b16= new JButton("E'");
	public JButton b17= new JButton("S ");
	public JButton b18= new JButton("S'");
	public JButton b19= new JButton("X ");
	public JButton b20= new JButton("X'");
	public JButton b21= new JButton("Y ");
	public JButton b22= new JButton("Y'");
	public JButton b23= new JButton("Z ");
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
		p.setLayout(new GridLayout(12,2));
		
		
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
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.L(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Ln(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.U(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Un(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.D(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Dn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.F(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Fn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.B(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Bn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.M(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Mn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.E(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.En(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.S(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Sn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.X(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        });       
        b20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Xn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Y(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Yn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Z(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        b24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	Moves.Zn(Main.rubik);
        	 	CubeRubik.show(Main.rubik);
            }
        }); 
        
        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        p.add(b19);
        p.add(b20);
        p.add(b21);
        p.add(b22);
        p.add(b23);
        p.add(b24);
        
        
        
		f.add(p, BorderLayout.EAST);
		
		}

}
