public class Main {
	
	public static int[][] rubik = new int[6][9];
	
	public final static int blue	=	0;
	public final static int orange	=	1;
	public final static int white	=	2;
	public final static int red		=	3;
	public final static int yellow	=	4;
	public final static int green	=	5;
	
//executable----------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args)   {
		
		CubeRubik.reset(rubik);
		CubeRubik.show(rubik);
		new GUI();
	}

}

