package lecture_data.tmp;
import java.math.*;
import java.util.*;;;

public class matCalc {
	
	//___________Field Var_______________
	//indexing for defaulf constructor
	// private static int[][] matrx = new int[3][4];
	// private static int[][] matrx2 = new int[4][5];
	
	//_____Constructor without var_____
	//this area is not need, cause jvm make themself there constructor
	//therfore do not need getter(return) setter(reset)
	// public matCalc(){
	// 	super();
	// }
	
		//_______Constructor with var_______
		//
		// public matCalc(int[][] matrx, int[][] matrx2) {
		// 	this.matrx=matrx;
		// 	this.matrx = matrx2;
		// }
	
	//__________getter method__________
	//return field var
	// public int[][] getmatrx()
	// {
	// 	return this.matrx;
	// }
	// public int[][] getmatrx2()
	// {
	// 	return this.matrx2;
	// }

	// __________setter method___________
	// reset field var
	// public void setmatrx(int[][] matrx)
	// {
	// 	this.matrx = matrx;
	// }
	// public void setmatrx2(int[][] matrx2)
	// {
	// 	this.matrx2 = matrx2;
	// }

	// private static int[][] matrx;
	// private static int[][] matrx2;


	//_________Q__________
	static void showMatrix(int [][]X) {
		//2차원 모습으로 출력
		System.out.println("___행렬___");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[0].length; j++) {
				int a=X[i][j];
                System.out.print(a);
				//align logic
				if (a<10||a>100) {
					for (int k = 0; k < 2; k++) {
						System.out.print(" ");
					}
				}
				else if (a<999) {
					for (int k = 0; k < 3; k++) {
						System.out.print(" ");
					}
				}
				else{
					System.out.print(" ");
				}
                
                if (j==X[0].length-1) {
                    System.out.println();
                }
                else{
                    continue;
                }
            }
        }
		System.out.println();
	}
	static  int [][] addMatrix(int [][]X, int [][]P){
		int [][] matrx = new int[X.length][X[0].length];
		if (X.length==P.length){
			for (int i = 0; i < X.length; i++) {
				for (int j = 0; j < X[0].length ; j++) {
					matrx[i][j] = X[i][j]+P[i][j];
					if (j==X[0].length-1) {
						System.out.println();
					}
					else{
						continue;
					}
				}
			}
			
        }
		return matrx ;
	}
	static void multiplyMatrix(int [][]B,int [][]E){
		
	}
	static void transposeMatrix(int [][]B){
		
	}
	
    // static void getData(int[][] b){
	// 		System.out.println(b.length +" X "+b[0].length );
	// 		System.out.println();
	// }

    // static void showMatrix(int [][]X) {
	// 	//2차원 모습으로 출력

	// }
	// static int[][] addMatrix(int [][] X, int [][] P){
	
	// }

	// static int[][] multiplyMatrix(int [][] X, int [][] P){
	// 	int de = 0;
	// 	for (int i = 0; i < X.length; i++) {
    //         for (int j = 0; j < P[0].length ; j++) {
	// 			for (int j2 = 0; j2 < X[0].length; j2++) {
	// 				int sum = X[i][j2]*P[j2][j];
	// 				de = de +sum;
	// 				}
	// 			matrx2[i][j] = de;
	// 			de = 0;
	// 			continue;
					
					
				
    //         }
    //     }
	// 	return matrx2;
	// }
	// static int[][] transposeMatrix(int[][] B){
	// 	return matrx;
	// }
		
	
	public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		int[][] A = new int[3][4];
		int[][] B = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] C = {{3,3,3,3},{3,3,3,3},{3,3,3,3}};
		int[][] E = {{2,4,6,8,10},{3,6,9,12,15},{1,2,3,4,5},{5,4,3,2,1}};
		int[][] D = new int[3][5];
		int[][] F = new int[3][4];
		
        
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		//getData(B);getData(C);getData(E);
		
		A = addMatrix(B, C);
		showMatrix(B);showMatrix(C);showMatrix(A);
		System.out.println();
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		
		// D = multiplyMatrix(B,E);
		// showMatrix(B);showMatrix(E);showMatrix(D);
		// System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		
		// F = transposeMatrix(B);
		// showMatrix(B);showMatrix(F);

	

	}
}
