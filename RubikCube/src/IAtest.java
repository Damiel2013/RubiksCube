public class IAtest implements Runnable {
	
	//Cette classe permet de conter la quantitée de cycles de certains mouvements pour résoudre le cube à nouveau
	
	@Override
	public void run() {
		int i = 0;
		Moves.Rn(Main.rubik);
		Moves.Un(Main.rubik);
		Moves.L(Main.rubik);
		Moves.F(Main.rubik);
		i++;
		//Tant que la face de devant n'est pas résolue
		//faire le cycle à nouveau
		while(Main.rubik[2][4] != Main.rubik[2][0] || Main.rubik[2][4] != Main.rubik[2][1] || Main.rubik[2][4] != Main.rubik[2][2] || Main.rubik[2][4] != Main.rubik[2][3] || Main.rubik[2][4] != Main.rubik[2][5] ||
				Main.rubik[2][4] != Main.rubik[2][6] || Main.rubik[2][4] != Main.rubik[2][7] || Main.rubik[2][4] != Main.rubik[2][8] ) {
			Moves.Rn(Main.rubik);			
			Moves.Un(Main.rubik);				
			Moves.L(Main.rubik);
			Moves.F(Main.rubik);
			i++;
			System.out.println(" is at :  " + i);				
			try {
				Thread.sleep(50);				//attendre 50 milisecondes
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}			
	
	}
