import java.util.Random;


public class Moves {
	
	public static int[] cornerNum = {0,2,8,6};	//les num�ros de chaque face des coins
	public static int[] edgeNum = {1,5,7,3};	//les num�ros de chaque face des bords
	public static int centerNum = 4;		//les num�ros de chaque face du centre
	
	
	//fait roter la face indiqu�e dans le sens des aiguilles d'une montre ou au contraire-----------------------------------------------------------------	
		public static void faceRotation(int[][] cube ,int faceNum, boolean clockwise) {
			int val, valAnt;
			
			//rotation des coins
			if(clockwise) {
				//rotation des 4 coins dans le sens des aiguilles d'une montre
				val = cube[faceNum][cornerNum[cornerNum.length-1]];		//obtenir les valeurs pour remplacer
				for(int i = 0; i < cornerNum.length; i++) {			
					valAnt = cube[faceNum][cornerNum[i]];			//obtenir les valeurs � remplacer
					cube[faceNum][cornerNum[i]] = val;			//remplacer les num�ros de chaque petit carr�
					val = valAnt;						//obtenir les nouvelles valeurs pour remplacer			
				}
			}
			else {
				//rotation des 4 coins dans le sens *contraire* des aiguilles d'une montre
				val = cube[faceNum][cornerNum[0]];
				for(int i = cornerNum.length-1; i >= 0; i--) {
					valAnt = cube[faceNum][cornerNum[i]];
					cube[faceNum][cornerNum[i]] = val;
					val = valAnt;									
				}
			}
			
			//rotation des bords
			if(clockwise) {
				//rotation des 4 bords dans le sens des aiguilles d'une montre
				val = cube[faceNum][edgeNum[edgeNum.length-1]];
				for(int i = 0; i < edgeNum.length; i++) {
					valAnt = cube[faceNum][edgeNum[i]];
					cube[faceNum][edgeNum[i]] = val;
					val = valAnt;									
				}
			}
			else {
				//rotation des 4 bords dans le sens *contraire* des aiguilles d'une montre
				val = cube[faceNum][edgeNum[0]];
				for(int i = edgeNum.length-1; i >= 0; i--) {
					valAnt = cube[faceNum][edgeNum[i]];
					cube[faceNum][edgeNum[i]] = val;
					val = valAnt;									
				}
			}			
		}
			
// LES 24 MOUVEMENTS POSSIBLES- Le "n" indique que le sens est celui contraire aux aigulles d'une montre --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
		public static void R (int[][] cube) {
			int val[] = new int[3];
			int valAnt[] = new int[3];
			int faces[]= {2,0,4,5,2};					//les faces affect�es (en ordre)
			faceRotation (cube,3,true);					//faire roter la face selon le mouvement : quel cube, quelle face, quel sens
			for(int j = 0; j < 5 ; j++)	{
				if(faces[j]==4) {				//besoin d'inverser le sens des carreaux dans la colonne (� cause du fait que le cube est en trois dimensions)
					int k = 0;
					for(int i = 2; i >= 0 ; i--) {
						int iforms [] = {i*3+2,i*3+2,i*3,i*3+2,i*3+2};	//les formules pour obtenir les colonnes (ou lignes) pour chaque face
						valAnt[k] = cube[faces[j]][iforms[j]];
						cube[faces[j]][iforms[j]] = val[k];
						val[k] = valAnt[k];
						k++;
					}	
				}	
				else {	
					for(int i = 0; i < 3 ; i++) {		//sans besoin d'inverser
						int iforms [] = {i*3+2,i*3+2,i*3,i*3+2,i*3+2};
						valAnt[i] = cube[faces[j]][iforms[j]];
						cube[faces[j]][iforms[j]] = val[i];
						val[i] = valAnt[i];
					}	
				}
			}
		}
		
	
	
	public static void Rn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];		
		int faces[]= {0,2,5,4,0};
		faceRotation (cube,3,false);	
		for(int j = 0; j < 5 ; j++)	{
			if(faces[j]==4) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i*3+2,i*3+2,i*3+2,i*3,i*3+2};
					valAnt[k] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[k];
					val[k] = valAnt[k];
					k++;
				}	
			}	
			else {	
				for(int i = 0; i < 3 ; i++) {
					int iforms [] = {i*3+2,i*3+2,i*3+2,i*3,i*3+2};
					valAnt[i] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}
	
	
	public static void L (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];		
		int faces[]= {0,2,5,4,0};
		faceRotation (cube,1,true);
		for(int j = 0; j < 5 ; j++)	{
			if(faces[j]==4) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i*3+2,i*3+2,i*3,i*3+2,i*3+2};
					valAnt[k] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[k];
					val[k] = valAnt[k];
					k++;
				}	
			}	
			else {
				for(int i = 0; i < 3 ; i++) {
					int iforms [] = {i*3,i*3,i*3,i*3+2,i*3};
					valAnt[i] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}
	
	public static void Ln (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];		
		int faces[]= {2,0,4,5,2};
		faceRotation (cube,1,false);	
		for(int j = 0; j < 5 ; j++)	{
			if(faces[j]==4) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i*3,i*3,i*3+2,i*3,i*3};
					valAnt[k] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[k];
					val[k] = valAnt[k];
					k++;
				}	
			}	
			else {	
				for(int i = 0; i < 3 ; i++) {
					int iforms [] = {i*3,i*3,i*3+2,i*3,i*3};
					valAnt[i] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}
	
	public static void U (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];		
		int faces[]= {2,1,4,3,2};
		faceRotation (cube,0,true);	
		for(int j = 0; j < 5 ; j++)	{
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
		int faces[]= {1,2,3,4,1};
		faceRotation (cube,0,false);
		for(int j = 0; j < 5 ; j++)	{
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
		int faces[]= {1,2,3,4,1};
		faceRotation (cube,5,true);
		for(int j = 0; j < 5 ; j++)	{
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
		int faces[]= {2,1,4,3,2};
		faceRotation (cube,5,false);	
		for(int j = 0; j < 5 ; j++)	{
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
		int faces[]= {0,3,5,1,0};
		faceRotation (cube,2,true);	
		for(int j = 0 ; j < 5 ; j++ ) {	
			if(faces[j]==5 || faces[j]==1) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i+6,i*3,i,i*3+2,i+6};
					valAnt[k] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[k];
					val[k] = valAnt[k];
					k++;
				}
			}
			else {
				for(int i = 0; i < 3 ; i++) {
					int iequations [] = {i+6,i*3,i,i*3+2,i+6} ;
					valAnt[i] = cube[faces[j]][iequations[j]];
					cube[faces[j]][iequations[j]] = val[i];
					val[i] = valAnt[i];				
				}
			}				
		}
	}	

	
	
	public static void Fn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];	
		int faces[]= {3,0,1,5,3};
		faceRotation (cube,2,false);	
		for(int j = 0 ; j < 5 ; j++ ) {
			if(faces[j]==5 || faces[j]==1) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i*3,i+6,i*3+2,i,i*3};
					valAnt[k] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[k];
					val[k] = valAnt[k];
					k++;
				}
			}
			else {
				for(int i = 0; i < 3 ; i++) {
					int iequations [] = {i*3,i+6,i*3+2,i,i*3} ;
					valAnt[i] = cube[faces[j]][iequations[j]];
					cube[faces[j]][iequations[j]] = val[i];
					val[i] = valAnt[i];				
				}
			}
		}
	}
	
	public static void B (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];	
		int faces[]= {3,0,1,5,3};
		faceRotation (cube,4,true);		
		for(int j = 0 ; j < 5 ; j++ ) {
			if(faces[j]==5 || faces[j]==1) {
			int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i*3+2,i,i*3,i+6,i*3+2};
					valAnt[k] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[k];
					val[k] = valAnt[k];
					k++;
				}
				}
				else {
				for(int i = 0; i < 3 ; i++) {
					int iequations [] = {i*3+2,i,i*3,i+6,i*3+2} ;
					valAnt[i] = cube[faces[j]][iequations[j]];
					cube[faces[j]][iequations[j]] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}	
	
	
	public static void Bn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		int faces[]= {0,3,5,1,0};
		faceRotation (cube,4,false);			
		for(int j = 0 ; j < 5 ; j++ ) {
			if(faces[j]==5 || faces[j]==1) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i,i*3+2,i+6,i*3,i};
					valAnt[k] = cube[faces[j]][iforms[j]];
					cube[faces[j]][iforms[j]] = val[k];
					val[k] = valAnt[k];
					k++;
				}
			}
			else {
				for(int i = 0; i < 3 ; i++) {
					int iequations [] = {i,i*3+2,i+6,i*3,i} ;
					valAnt[i] = cube[faces[j]][iequations[j]];
					cube[faces[j]][iequations[j]] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}	
	
	public static void M (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		int faces[]= {0,2,5,4,0};
		for(int j = 0; j < 5 ; j++){
			if(faces[j]==4) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					valAnt[k] = cube[faces[j]][(i*3)+1];
					cube[faces[j]][(i*3)+1] = val[k];
					val[k] = valAnt[k];
					k++;
				}	
			}	
			else {
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i*3)+1];
					cube[faces[j]][(i*3)+1] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}
	
	public static void Mn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];		
		int faces[]= {2,0,4,5,2};
		for(int j = 0; j < 5 ; j++){
			if(faces[j]==4) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					valAnt[k] = cube[faces[j]][(i*3)+1];
					cube[faces[j]][(i*3)+1] = val[k];
					val[k] = valAnt[k];
					k++;
				}	
			}	
			else {
				for(int i = 0; i < 3 ; i++) {
					valAnt[i] = cube[faces[j]][(i*3)+1];
					cube[faces[j]][(i*3)+1] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}
	
	public static void E (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];
		int faces[]= {2,3,4,1,2};
		for(int j = 0; j < 5 ; j++)	{
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
		int faces[]= {3,2,1,4,3};
		for(int j = 0; j < 5 ; j++){
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
		int faces[]= {1,0,3,5,1};			
		for(int j = 0; j<5; j++) {				
			if(faces[j]==5 || faces[j]==1) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {(i*3)+1,(i+3),(i*3)+1,i+3,(i*3)+1};
					valAnt[k] =cube[faces[j]][iforms [j]];
					cube[faces[j]][iforms [j]] = val[k];
					val[k] = valAnt[k];	
					k++;
					}	
				}
			else {
				for(int i = 0; i < 3 ; i++) {
					int iforms [] = {(i*3)+1,(i+3),(i*3)+1,i+3,(i*3)+1};
					valAnt[i] = cube[faces[j]][iforms [j]];
					cube[faces[j]][iforms [j]] = val[i];
					val[i] = valAnt[i];
				}
			}
		}
	}	
	
	
	public static void Sn (int[][] cube) {
		int val[] = new int[3];
		int valAnt[] = new int[3];	
		int faces[]= {0,1,5,3,0};
		for(int j = 0; j<5; j++) {				
			if(faces[j]==5 || faces[j]==1) {
				int k = 0;
				for(int i = 2; i >= 0 ; i--) {
					int iforms [] = {i+3,(i*3)+1,(i+3),(i*3)+1,(i+3)};
					valAnt[k] =cube[faces[j]][iforms [j]];
					cube[faces[j]][iforms [j]] = val[k];
					val[k] = valAnt[k];	
					k++;
					}	
				}
			else {
				for(int i = 0; i < 3 ; i++) {
					int iforms [] = {i+3,(i*3)+1,(i+3),(i*3)+1,(i+3)};
					valAnt[i] = cube[faces[j]][iforms [j]];
					cube[faces[j]][iforms [j]] = val[i];
					val[i] = valAnt[i];
				}
			}
		}	
	}

		
	public static void X(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {2,0,4,5,2};
		faceRotation (cube,3,true);	
		faceRotation (cube,1,false);
		for(int j = 0; j < 5 ; j++){
			if(faces[j]==4 ) {
				int k = 0;
				for(int i = 8; i >= 0 ; i--) {
					valAnt[k] =cube[faces[j]][i];
					cube[faces[j]][i] = val[k];
					val[k] = valAnt[k];	
					k++;
					}	
			}	
			else {
				for(int i = 0; i < 9 ; i++) {
					valAnt[i] = cube[faces[j]][(i)];
					cube[faces[j]][(i)] = val[i];
					val[i] = valAnt[i];
				}
			}	
		}
	}	
	
	public static void Xn(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {0,2,5,4,0};
		faceRotation (cube,3,false);	
		faceRotation (cube,1,true);
		for(int j = 0; j < 5 ; j++){
			if(faces[j]==4 ) {
				int k = 0;
				for(int i = 8; i >= 0 ; i--) {
					valAnt[k] =cube[faces[j]][i];
					cube[faces[j]][i] = val[k];
					val[k] = valAnt[k];	
					k++;
					}	
			}	
			else {
				for(int i = 0; i < 9 ; i++) {
					valAnt[i] = cube[faces[j]][(i)];
					cube[faces[j]][(i)] = val[i];
					val[i] = valAnt[i];
				}
			}	
		}
	}
	
	
	public static void Y(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {3,2,1,4,3};
		faceRotation (cube,0,true);	
		faceRotation (cube,5,false);			
		for(int j = 0; j < 5 ; j++){
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
		int faces[]= {2,3,4,1,2};
		faceRotation (cube,0,false);	
		faceRotation (cube,5,true);
		for(int j = 0; j < 5 ; j++){
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
		int faces[]= {1,0,3,5,1};
		faceRotation (cube,2,true);	
		faceRotation (cube,4,false);	
		for(int j = 0; j < 5 ; j++){
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
		faceRotation (cube,3,true);	
		faceRotation (cube,0,true);
		faceRotation (cube,5,true);
		faceRotation (cube,1,true);
	}
	
	public static void Zn(int[][] cube) {
		int val[] = new int[9];
		int valAnt[] = new int[9];
		int faces[]= {0,1,5,3,0};
		faceRotation (cube,2,false);	
		faceRotation (cube,4,true);
		for(int j = 0; j < 5 ; j++)	{
			for(int i = 0; i < 9 ; i++) {
				valAnt[i] = cube[faces[j]][(i)];
				cube[faces[j]][(i)] = val[i];
				val[i] = valAnt[i];
			}
		}
		faceRotation (cube,3,false);	
		faceRotation (cube,0,false);
		faceRotation (cube,5,false);
		faceRotation (cube,1,false);
	}
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
//fonction de m�lange du cube
	
	public static String scrambleText = "";		//initialization du texte du m�lange
	
	public static void scramble(int[][] cube) {
		CubeRubik.reset(cube);			//r�intialization du cube pour le m�langer
		scrambleText = "Scramble : ";		//remise du texte du m�lange
		Random rand = new Random();		//initializer une nouvelle valeur al�atoire
		int n;
		for(int i = 0; i< 20 ; i++) {		//20 valeurs al�atoires  
			n = rand.nextInt(12);		//de 1 � 12 
			switch (n) {
			case 1:				//si le nombre al�atoire vaut 1
				L(cube);		//faire L
				scrambleText += "L ";	//ajouter L au texte du m�lange
				break;				
			case 2:	
				Ln(cube);
				scrambleText += "L' ";
				break;	
			case 3:
				R(cube);
				scrambleText += "R ";
				break;
			case 4:
				Rn(cube);
				scrambleText += "R' ";
				break;	
			case 5:
				U(cube);
				scrambleText += "U ";
				break;
			case 6:
				Un(cube);
				scrambleText += "U' ";
				break;	
			case 7:
				D(cube);
				scrambleText += "D ";
				break;
			case 8:
				Dn(cube);
				scrambleText += "D' ";
				break;	
			case 9:
				F(cube);
				scrambleText += "F ";
				break;	
			case 10:
				Fn(cube);
				scrambleText += "F' ";
				break;	
			case 11:
				B(cube);
				scrambleText += "B ";
				break;	
			case 12:
				Bn(cube);
				scrambleText += "B' ";
				break;	
			}
		}
		GUI.scramblelabel.setText(scrambleText);	//remettre le texte du m�lange de l'interface
	}

	
	

}
