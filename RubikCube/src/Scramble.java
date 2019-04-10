import java.util.Random;

public class Scramble implements Runnable {
	
	public static boolean isscrambling = false;		//variable pour savoir si le mélange est en train d'être fait ou pas
	public static String scrambleText = "";			//initialization du texte du mélange
	
	
	
	public void run(){	
		
		isscrambling = true;
		CubeRubik.reset(Main.rubik);				//réintialization du cube pour le mélanger
		scrambleText = "Scramble : ";				//remise du texte du mélange
		Random rand = new Random();					//initializer une nouvelle valeur aléatoire
		int n;
		for(int i = 0; i< 20 ; i++) {				//20 valeurs aléatoires  
			n = rand.nextInt(12);					//de 1 à 12 
			switch (n) {
			case 1:									//si le nombre aléatoire vaut 1
				Moves.L(Main.rubik);				//faire L
				scrambleText += "L ";				//ajouter "L" au texte du mélange
				break;				
			case 2:	
				Moves.Ln(Main.rubik);
				scrambleText += "L' ";
				break;	
			case 3:
				Moves.R(Main.rubik);
				scrambleText += "R ";
				break;
			case 4:
				Moves.Rn(Main.rubik);
				scrambleText += "R' ";
				break;	
			case 5:
				Moves.U(Main.rubik);
				scrambleText += "U ";
				break;
			case 6:
				Moves.Un(Main.rubik);
				scrambleText += "U' ";
				break;	
			case 7:
				Moves.D(Main.rubik);
				scrambleText += "D ";
				break;
			case 8:
				Moves.Dn(Main.rubik);
				scrambleText += "D' ";
				break;	
			case 9:
				Moves.F(Main.rubik);
				scrambleText += "F ";
				break;	
			case 10:
				Moves.Fn(Main.rubik);
				scrambleText += "F' ";
				break;	
			case 11:
				Moves.B(Main.rubik);
				scrambleText += "B ";
				break;	
			case 12:
				Moves.Bn(Main.rubik);
				scrambleText += "B' ";
				break;	
			}		
			try {
				Thread.sleep(75);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			GUI.scramblelabel.setText(scrambleText);		//remettre le texte du mélange de l'interface
		}
		isscrambling = false;
	}

}
