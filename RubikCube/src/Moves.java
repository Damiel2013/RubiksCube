
public class Moves  {
	
	public static int[] cornerNum = {0,2,8,6};
	public static int[] edgeNum = {1,5,7,3};
	public static int centerNum = 4;
	
	
	
	//fait une rotation de la face indiqueé dans le sens des aiguilles d'une montre ou au contraire-----------------------------------------------------------------	
		public static void faceRotation(int[][] cube ,int faceNum, boolean clockwise) {
			int val, valAnt;
			
			//rotation des coins
			if(clockwise) {
				//rotation des 4 coins dans le sens des aiguilles d'une montre
				val = cube[faceNum][cornerNum[cornerNum.length-1]];
				for(int i = 0; i < cornerNum.length; i++) {
					valAnt = cube[faceNum][cornerNum[i]];
					cube[faceNum][cornerNum[i]] = val;
					val = valAnt;									
				}
				//rotation des 4 bords dans le sens des aiguilles d'une montre
				val = cube[faceNum][edgeNum[edgeNum.length-1]];
				for(int i = 0; i < edgeNum.length; i++) {
					valAnt = cube[faceNum][edgeNum[i]];
					cube[faceNum][edgeNum[i]] = val;
					val = valAnt;		
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
					int faces[]= {2,0,4,5,2};								//les faces affectées (en ordre)
					faceRotation (cube,3,true);									//faire une rotation de la face selon le mouvement : quel cube, quelle face, quel sens
					for(int j = 0; j < 5 ; j++)	{
						if(faces[j]==4) {										//besoin d'inverser le sens des carreaux dans la colonne (à cause de la nature tridimensionelle du cube)
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

}
	
