public class Main {
	
	public static int[][] rubik = new int[6][9];
	
	
//executable----------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		CubeRubik.remplissage(rubik);
		CubeRubik.show(rubik);
		Moves.scrumble(rubik);
		CubeRubik.show(rubik);
		
	}

}



		//blue:			0
		//orange:		1
		//white:		2
		//green:		3
		//red:			4
		//yellow:		5