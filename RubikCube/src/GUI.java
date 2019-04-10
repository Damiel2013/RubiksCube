import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame  {		//Classe qui initialise la fenêtre

	static JLabel scramblelabel = new JLabel("Scramble : ", JLabel.CENTER);
	
	
	
	public GUI() {	
		super("Cube de Rubik");									//nommer la fenêtre 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 900);										//taille de la fenêtre
		Container container = getContentPane();
		
		Buttons buttons = new Buttons();						//déclarer une fenêtre avec les boutons
		PanelCube rubik = new PanelCube(); 						//déclarer une fenêtre avec le cube
				
		JSplitPane splitPaneRight = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, rubik, buttons);			//séparer le cube et les boutons
		splitPaneRight.setOneTouchExpandable(true);
		splitPaneRight.setDividerLocation(750);
		
		container.add(splitPaneRight);
	
		validate();
		setVisible(true);
		boolean exit = false;
		while (!exit) {
			repaint();
		}
		
		
	}
	
	
	public class Buttons extends JPanel implements ActionListener{			//Classe qui initialise les boutons
		
		public JButton b1= new JButton("R ");			//initialiser le bouton "b1" avec le texte "R "
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
		public JButton b25= new JButton("Scramble");
		public JButton b26= new JButton("Reset ");
		public JButton b27= new JButton("IAtest ");
		
		public Buttons() {	
			
		
			b1.addActionListener(new ActionListener() {						
				public void actionPerformed(ActionEvent event) {		//quand le bouton est touché
					if(Scramble.isscrambling == false) {				//vérifier que le mélange n'est pas être en train de se faire
	            		Moves.R(Main.rubik);							//faire le mouvement désiré	
	        	 		CubeRubik.show(Main.rubik);						//montrer le cube après le mouvement
	            	}	
	            }
	        });       
	        b2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Rn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.L(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b4.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Ln(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b5.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.U(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b6.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Un(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b7.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.D(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b8.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Dn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b9.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.F(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b10.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Fn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b11.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.B(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b12.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Bn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b13.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Mn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b14.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Mn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b15.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.E(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b16.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.En(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b17.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.S(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b18.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Sn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b19.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
		            	Moves.X(Main.rubik);
		        	 	CubeRubik.show(Main.rubik);
	            	}
	            }
	        });       
	        b20.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
		            	Moves.Xn(Main.rubik);
		        	 	CubeRubik.show(Main.rubik);
	            	}	
	            }
	        }); 
	      b21.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Y(Main.rubik);
	            		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b22.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {		
	            		Moves.Yn(Main.rubik);
	        	 		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b23.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Z(Main.rubik);
	            		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b24.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		Moves.Zn(Main.rubik);
	            		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b25.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		new Thread (new Scramble()).start();			//Ouvrir un "fil" avec le mélange
	            		CubeRubik.show(Main.rubik);
	            	}
	            }
	        }); 
	        b26.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
		            	CubeRubik.reset(Main.rubik);
		            	CubeRubik.show(Main.rubik); 
	            	}	
	            }
	        });
	        b27.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	            	if(Scramble.isscrambling == false) {	
	            		new Thread (new IAtest()).start();			
	            		CubeRubik.show(Main.rubik);    
	            	}	
	            }
	        }); 
		
	        
	        add(b1);			//ajouter "b1" au panneau avec les boutons
	        add(b2);
	        add(b3);
	        add(b4);
	        add(b5);
	        add(b6);
	        add(b7);
	        add(b8);
	        add(b9);
	        add(b10);
	        add(b11);
	        add(b12);
	        add(b13);
	        add(b14);
	        add(b15);
	        add(b16);
	        add(b17);
	        add(b18);
	        add(b19);
	        add(b20);
	        add(b21);
	        add(b22);
	        add(b23);
	        add(b24);
	        add(b25);
	        add(b26);	
	        add(b27);
	     
	        
	        

		}
		@Override
		public void actionPerformed(ActionEvent arg0) {	
		}  
	}
	
	public class PanelCube extends JPanel {
		
		public PanelCube(){
			this.setMinimumSize(new Dimension (750,900));
			scramblelabel.setFont(new Font("Helvetica",Font.BOLD,24));
			this.add(scramblelabel);
			
		}		
		public void paintComponent(Graphics _g) {
			Graphics2D g = (Graphics2D) _g;			
			//Dimensions d'un carré
			int cubeX0 = 75;				//position sur X du premier carré
			int cubeY0 = 60;				//position sur Y du premier carré
			int cubeWH = 42; 				//Hauteur et largeur d'un carré
			int i = 0;
			int coordsx [] = {0,3,3,3,3,6};//multiplicateurs sur X nécéssaires
			int coordsy [] = {3,0,3,6,9,3};//multiplicateurs sur Y nécéssaires
			
			
			for(int l = 0; l< 6;l++) {			
				for(int k = coordsx[l]; k<coordsx[l]+3;k++) {				
					for(int j = coordsy[l]; j<coordsy[l]+3 ;j++) {	
						drawSqr(g, cubeX0 + j*cubeWH,cubeY0 + k*cubeWH, getColor(Main.rubik[l][i]));		//dessiner un carré au coordonnées désirés  
						i++;						
					//	System.out.println("DEBUG : x " + j*cubeW + "  y :" + cubeY + k*cubeH + "  i : " + i );
					}
				}
				i = 0;
			}
		}
		
		public void drawSqr(Graphics2D g, int x, int y, Color color) {
			g.setColor(color);
			g.fillRect(x, y, 40, 40);			//dessiner un rectangle du couleur du numéro
			g.setColor(Color.black);
			g.drawRect(x, y, 40, 40);			//dessiner un rebord en noir pour chaque carré
			//System.out.println("DEBUG : Painting called" );
		}
		
		public Color getColor(int color) {			//déterminer la couleur pour dessiner
			if(color == Main.white) {
				return Color.white;
				//System.out.println("DEBUG : WHITE" );
			} else if(color == Main.yellow) {
				return Color.yellow;
				//System.out.println("DEBUG : YELLOW" );
			} else if(color == Main.red) {
				return Color.red;
				//System.out.println("DEBUG : RED );
			} else if(color == Main.orange) {
				return Color.orange;
				//System.out.println("DEBUG : ORANGE" );
			} else if(color == Main.blue) {
				return Color.blue;
				//System.out.println("DEBUG : BLUE" );
			} else if(color == Main.green) {
				return Color.green;
				//System.out.println("DEBUG : GREEN" );
			}
			return Color.black;
		}
		
			
		
		
		
	}
	
	
	
}



