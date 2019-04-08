public class IAtest implements Runnable {

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
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		Moves.Rn(Main.rubik);
		Moves.Un(Main.rubik);
		Moves.L(Main.rubik);
		Moves.F(Main.rubik);
	i++;
		while(Main.rubik[2][4] != Main.rubik[2][0] || Main.rubik[2][4] != Main.rubik[2][1] || Main.rubik[2][4] != Main.rubik[2][2] || Main.rubik[2][4] != Main.rubik[2][3] || Main.rubik[2][4] != Main.rubik[2][5] ||
				Main.rubik[2][4] != Main.rubik[2][6] || Main.rubik[2][4] != Main.rubik[2][7] || Main.rubik[2][4] != Main.rubik[2][8] ) {
			Moves.Rn(Main.rubik);			
			Moves.Un(Main.rubik);				
			Moves.L(Main.rubik);
			Moves.F(Main.rubik);
			i++;
			System.out.println("va por :  " + i);				
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}			
	
	}
