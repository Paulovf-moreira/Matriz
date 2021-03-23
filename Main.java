import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int [][] matriz = new int [n][n];
		
		for (int i=0;i<matriz.length;i++){
		    for(int j=0; j<matriz[i].length;j++){
		        matriz [i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Diagonal Principal");
		for (int i=0;i<matriz.length;i++){
		    System.out.println(matriz [i][i]+"");
		    
		}
		
		int a=0;
		
		for(int i=0;i<matriz.length;i++){
		    for(int j=0;j<matriz[i].length;j++){
		        if(matriz [i][j]<0){
		            
		            a +=1;
		        }
		        
		    }
		    
		}
		
		System.out.println("Numeros negativos = "+a);
		
		sc.close();
	}
}