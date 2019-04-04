public class IAtest {

	/*
	etapas :
	1 - white cross
	2 - white corners
	3 - second row
	4 - yellow cross
	5 - yellow corners
	6 - finishing cube
	
	
	Is in Moves :
	
	public static int[] cornerNum = {0,2,8,6};
	public static int[] edgeNum = {1,5,7,3};
	
	
	*/
	
	
	
	public static void solve(int cube[][]) {
		
		for(int i = 0; i<cube.length;i++) {
			if(cube[i][4] == 2) {
				switch (i){
					case 0 :
						Moves.Xn(cube);
					break;
					case 1 :
						Moves.Yn(cube);
					break;	
					case 2 :
						
					break;
					case 3 :
						Moves.Y(cube);	
					break;
					case 4 :
						Moves.Y(cube);	
						Moves.Y(cube);	
					break;
					case 5 :
						Moves.X(cube);
					break;
				}
				break;
			}	
		}
		System.out.println("posicionamiento");
		}		
	}
