
public class Main {
	
	public static int[] cornerNum = {0,2,8,6};
	public static int[] edgeNum = {1,5,7,3};
	public static int centerNum = 4;
	
	static int[][] rubik = new int[6][9];

//executable----------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		//orange:		0
		//green:		1
		//white:		2
		//blue:			3
		//yellow:		4
		//red:			5
				   
		//remplissage du Rubik's cube resolu---------------------------------------------------------
		for(int i = 0; i < rubik.length; i++) {
			for(int j = 0; j < rubik[i].length; j++) {
				rubik[i][j] = i;
			}
		}

		//action du programme------------------------------------------------------------------------
		
		DEBUG();
		show(rubik);
		faceRotation(4,true);
		show(rubik);
		
	}

//fait roter la face indiqueé dans le sens des aiguilles d'une montre ou au contraire-----------------------------------------------------------------	
	public static void faceRotation( int faceNum, boolean clockwise) {
		int val, valAnt;
		
		//rotation des coins
		if(clockwise) {
			//rotation des 4 coins dans le sens des aiguilles d'une montre
			valAnt = rubik[faceNum][cornerNum[cornerNum.length-1]];
			for(int i = 0; i < cornerNum.length; i++) {
				val = rubik[faceNum][cornerNum[i]];
				rubik[faceNum][cornerNum[i]] = valAnt;
				valAnt = val;									
			}
		}
		else {
			//rotation des 4 coins dans le sens *contraire* des aiguilles d'une montre
			valAnt = rubik[faceNum][cornerNum[0]];
			for(int i = cornerNum.length-1; i >= 0; i--) {
				val = rubik[faceNum][cornerNum[i]];
				rubik[faceNum][cornerNum[i]] = valAnt;
				valAnt = val;									
			}
		}
		
		//rotation des bords
		if(clockwise) {
			//rotation des 4 bords dans le sens des aiguilles d'une montre
			valAnt = rubik[faceNum][edgeNum[edgeNum.length-1]];
			for(int i = 0; i < edgeNum.length; i++) {
				val = rubik[faceNum][edgeNum[i]];
				rubik[faceNum][edgeNum[i]] = valAnt;
				valAnt = val;									
			}
		}
		else {
			//rotation des 4 bords dans le sens *contraire* des aiguilles d'une montre
			valAnt = rubik[faceNum][edgeNum[0]];
			for(int i = edgeNum.length-1; i >= 0; i--) {
				val = rubik[faceNum][edgeNum[i]];
				rubik[faceNum][edgeNum[i]] = valAnt;
				valAnt = val;									
			}
		}
		
	}
	
	
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
	}
	
	
	public static void showLine(int[] face, int row, boolean ln, boolean space) {
		if(space) {System.out.print("   ");}
		for(int j = 3*row; j <  3+3*row; j++) {
			System.out.print(face[j]);
		}
		if(ln) {System.out.println();}
		
	}
	
	public static void DEBUG() {
		for(int i = 0; i < 9; i++) {
			rubik[centerNum][i] = i;
		}
	}
	
}
