public class Main {
	
//d�claration des variables globales du programme-----------------------------------------------------------------------------------------------
	
	public static int[][] rubik = new int[6][9];	//Cube de rubik utilis�
	
	//les couleurs associ�s � leur num�ro
	public final static int blue	=	0;
	public final static int orange	=	1;
	public final static int white	=	2;
	public final static int red	=	3;
	public final static int yellow	=	4;
	public final static int green	=	5;
	
//executable----------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args)   {
		
		CubeRubik.reset(rubik);	//initialiser le cube de rubik (r�solu)
		CubeRubik.show(rubik);	//montrer le cube r�solu dans la console
		new GUI();		//initialiser l'interface graphique pour l'utilisateur
	}

}

