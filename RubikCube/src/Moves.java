
import java.util.Random;

public class Moves {
	
	public static int[] cornerNum = {0,2,8,6};
	public static int[] edgeNum = {1,5,7,3};
	public static int centerNum = 4;
	
	
	//fait roter la face indiqueé dans le sens des aiguilles d'une montre ou au contraire-----------------------------------------------------------------	
		public static void faceRotation(int[][] cube ,int faceNum, boolean clockwise) {
			int val, valAnt;
			
			//rotation des coins
			if(clockwise) {
				//rotation des 4 coins dans le sens des aiguilles d'une montre
				valAnt = cube[faceNum][cornerNum[cornerNum.length-1]];
				for(int i = 0; i < cornerNum.length; i++) {
					val = cube[faceNum][cornerNum[i]];
					cube[faceNum][cornerNum[i]] = valAnt;
					valAnt = val;									
				}
			}
			else {
				//rotation des 4 coins dans le sens *contraire* des aiguilles d'une montre
				valAnt = cube[faceNum][cornerNum[0]];
				for(int i = cornerNum.length-1; i >= 0; i--) {
					val = cube[faceNum][cornerNum[i]];
					cube[faceNum][cornerNum[i]] = valAnt;
					valAnt = val;									
				}
			}
			
			//rotation des bords
			if(clockwise) {
				//rotation des 4 bords dans le sens des aiguilles d'une montre
				valAnt = cube[faceNum][edgeNum[edgeNum.length-1]];
				for(int i = 0; i < edgeNum.length; i++) {
					val = cube[faceNum][edgeNum[i]];
					cube[faceNum][edgeNum[i]] = valAnt;
					valAnt = val;									
				}
			}
			else {
				//rotation des 4 bords dans le sens *contraire* des aiguilles d'une montre
				valAnt = cube[faceNum][edgeNum[0]];
				for(int i = edgeNum.length-1; i >= 0; i--) {
					val = cube[faceNum][edgeNum[i]];
					cube[faceNum][edgeNum[i]] = valAnt;
					valAnt = val;									
				}
			}
			
		}
	
	
	
	
	public static void R (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {0,4,5,2};
			faceRotation (cube,3,true);	
			for(int i = 1; i <= 3 ; i++) {
				val[i-1] = cube[faces[3]][(i*3)-1] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 1; i <= 3 ; i++) {
					valAnt[i-1] = cube[faces[j]][(i*3)-1];
					cube[faces[j]][(i*3)-1] = val[i-1];
					val[i-1] = valAnt[i-1];
				}
			}
	}
	
	public static void Rn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {2,5,4,0};
			faceRotation (cube,3,false);	
			for(int i = 0; i < 3 ; i++) {
				val[i-1] = cube[faces[3]][(i*3)+2] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i-1] = cube[faces[j]][(i*3)+2];
					cube[faces[j]][(i*3)+2] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void L (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {0,4,5,2};
			faceRotation (cube,1,true);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i*3)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i*3)];
					cube[faces[j]][(i*3)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void Ln (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {2,5,4,0};
			faceRotation (cube,1,false);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i*3)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i*3)];
					cube[faces[j]][(i*3)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void U (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {1,4,3,2};
			faceRotation (cube,0,true);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i)];
					cube[faces[j]][(i)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void Un (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {2,3,4,1};
			faceRotation (cube,0,false);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i)];
					cube[faces[j]][(i)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void D (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {2,3,4,1};
			faceRotation (cube,5,false);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i+6)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i+6)];
					cube[faces[j]][i+6] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void Dn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {1,4,3,2};
			faceRotation (cube,5,true);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i+6)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i+6)];
					cube[faces[j]][i+6] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void F (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		int j = 0 ;
		
			int faces[]= {3,5,1,0};
			faceRotation (cube,2,true);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i+6)] ;
			}
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i*3)];
				cube[faces[j]][i*3] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][i] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i*3)+2];
				cube[faces[j]][(i*3)+2] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][i+6];
				cube[faces[j]][i+6] = val[i];
				val[i] = valAnt[i];
			}			
	}	
	
	public static void Fn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		int j = 0 ;
		
			int faces[]= {0,1,5,3};
			faceRotation (cube,2,false);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i*3)] ;
			}
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i+6)];
				cube[faces[j]][i+6] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i*3)+2];
				cube[faces[j]][(i*3)+2] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][i];
				cube[faces[j]][i] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][i*3];
				cube[faces[j]][i*3] = val[i];
				val[i] = valAnt[i];
			}			
	}
	
	public static void B (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		int j = 0 ;
		
			int faces[]= {0,1,5,3};
			faceRotation (cube,4,false);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i*3)+2] ;
			}
			//0
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			//1
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] =cube[faces[j]][(i*3)];
				cube[faces[j]][i*3] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			//5
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i+6)];
				cube[faces[j]][(i+6)] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			//3
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i*3)+2];
				cube[faces[j]][(i*3)+2] = val[i];
				val[i] = valAnt[i];
			}			
	}	
	
	public static void Bn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		int j = 0 ;
		
			int faces[]= {3,5,1,0};
			faceRotation (cube,4,true);	
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i)] ;
				
			}
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i*3)+2];
				cube[faces[j]][(i*3)+2] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i+6)];
				cube[faces[j]][i+6] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][(i*3)];
				cube[faces[j]][(i*3)] = val[i];
				val[i] = valAnt[i];
			}
			j++;
			for(int i = 0; i < 3 ; i++) {
				valAnt[i] = cube[faces[j]][i];
				cube[faces[j]][i] = val[i];
				val[i] = valAnt[i];
			}			
	}	
	
	public static void M (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {2,5,4,0};
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i*3)+1] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i*3)+1];
					cube[faces[j]][(i*3)+1] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void Mn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {0,4,5,2};
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i*3)+1] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i*3)+1];
					cube[faces[j]][(i*3)+1] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void E (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {3,4,1,2};
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i+3)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i+3)];
					cube[faces[j]][(i+3)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void En (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {2,1,4,3};
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i+3)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i+3)];
					cube[faces[j]][(i+3)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void S (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {0,3,5,1};
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i+3)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] =cube[faces[j]][(i+3)];
					cube[faces[j]][(i+3)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void Sn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		
			int faces[]= {1,5,3,0};
			for(int i = 0; i < 3 ; i++) {
				val[i] = cube[faces[3]][(i+3)] ;
			}
			for(int j = 0; j < 4 ; j++)	{
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i+3)];
					cube[faces[j]][(i+3)] = val[i];
					val[i] = valAnt[i];
				}
			}
	}
	
	public static void X(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {0,4,5,2};
		faceRotation (cube,3,true);	
		faceRotation (cube,1,true);			
		for(int i = 0; i < 9 ; i++) {
			val[i] = cube[faces[3]][(i)] ;
		}
		for(int j = 0; j < 4 ; j++)	{
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
	}
	
	public static void Xn(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {2,5,4,0};
		faceRotation (cube,3,false);	
		faceRotation (cube,1,false);		
		for(int i = 0; i < 9 ; i++) {
			val[i] = cube[faces[3]][(i)] ;
		}
		for(int j = 0; j < 4 ; j++)	{
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
	}
	
	public static void Y(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {2,1,4,3};
		faceRotation (cube,0,true);	
		faceRotation (cube,5,true);			
		for(int i = 0; i < 9 ; i++) {
			val[i] = cube[faces[3]][(i)] ;
		}
		for(int j = 0; j < 4 ; j++)	{
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
	}
	
	public static void Yn(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {3,4,1,2};
		faceRotation (cube,0,false);	
		faceRotation (cube,5,false);			
		for(int i = 0; i < 9 ; i++) {
			val[i] = cube[faces[3]][(i)] ;
		}
		for(int j = 0; j < 4 ; j++)	{
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
	}
	
	public static void Z(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {0,3,5,1};
		faceRotation (cube,2,true);	
		faceRotation (cube,4,true);			
		for(int i = 0; i < 9 ; i++) {
			val[i] = cube[faces[3]][(i)] ;
		}
		for(int j = 0; j < 4 ; j++)	{
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
	}
	
	public static void Zn(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {1,5,3,0};
		faceRotation (cube,2,false);	
		faceRotation (cube,4,false);			
		for(int i = 0; i < 9 ; i++) {
			val[i] = cube[faces[3]][(i)] ;
		}
		for(int j = 0; j < 4 ; j++)	{
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
	}
	
	
	
	public static void scrumble(int[][] cube) {
		Random rand = new Random();
		int n;
		for(int i = 0; i< 20 ; i++) {
			n = rand.nextInt(18);
			switch (n) {
			case 1:
				L(cube);
				break;				
			case 2:	
				Ln(cube);
				break;	
			case 3:
				R(cube);
				break;
			case 4:
				Rn(cube);
				break;	
			case 5:
				U(cube);
				break;
			case 6:
				Un(cube);
				break;	
			case 7:
				D(cube);
				break;
			case 8:
				Dn(cube);
				break;	
			case 9:
				F(cube);
				break;	
			case 10:
				Fn(cube);
				break;	
			case 11:
				B(cube);
				break;	
			case 12:
				Bn(cube);
				break;	
			case 13:
				M(cube);
				break;				
			case 14:	
				Mn(cube);
				break;	
			case 15:
				E(cube);
				break;
			case 16:
				En(cube);
				break;	
			case 17:
				S(cube);
				break;
			case 18:
				Sn(cube);
				break;	
			}
		}
	}

	
	

}