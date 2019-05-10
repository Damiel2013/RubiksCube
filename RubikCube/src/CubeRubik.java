public class CubeRubik {

	//fonction d'initialisation du cube		
	public static void reset(int[][] cube){
		GUI.scramblelabel.setText("Scramble : ");
		GUI.moveslabel.setText("Moves : ");
		GUI.movesText = "Moves : " ;
		for(int i = 0; i < cube.length; i++) {
			for(int j = 0; j < cube[i].length; j++) {
				cube[i][j] = i;
			}
		}
	}

	//fonction qui montre le cube dans la console par ligne
	public static void showLine(int[] face, int row, boolean ln, boolean space) {
		if(space) {System.out.print("   ");}
		for(int j = 3*row; j <  3+3*row; j++) {
			System.out.print(face[j]);
		}
		if(ln) {System.out.println();}
		
	}

	//fonction qui montre chaque ligne du cube	
	public static void show(int[][] cube) {
		for(int j = 0; j <  3; j++) {
			showLine(cube[0], j, true, true);
		}
		for(int j = 0; j < 3; j++) {
			for(int i = 1; i < 5;i++) {
				showLine(cube[i], j, false, false);
			}
			System.out.println();
		}
		for(int j = 0; j <  3; j++) {
			showLine(cube[5], j, true, true);
		}
		System.out.println();
	}
	
	//fonction de DEBUG qui remet la couleur du centre de chaque face 	
	public static void DEBUG(int[][] cube) {
		for(int i = 0; i < 9; i++) {
			cube[Moves.centerNum][i] = i;
		}
	}
	
	
}