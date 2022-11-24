/*Scrivere una Matrice Quadrata che prende in input una dimensione
 random e un carattere casuale che sia visualizzato nelle diagonali della matrice
 ESEMPIO:
 F 0 0 0 0 0 F 
 0 F 0 0 0 F 0 
 0 0 F 0 F 0 0 
 0 0 0 F 0 0 0 
 0 0 F 0 F 0 0 
 0 F 0 0 0 F 0 
 F 0 0 0 0 0 F 
*/

public class MatriceQuadrata{
    public static void main (String[] args){
    	stampaMatrice(7,"F");
    }
    
    public static void stampaMatrice(int dim_matrice, String carattere){
    	
    	String[][] arr = new String[dim_matrice][dim_matrice];
        for (int i = 0; i < dim_matrice; i++){
            for (int j = 0; (arr[i] != null && j < arr[i].length); j++){
            	if (i==j || j==(arr[i].length-(i+1))) {
            	    arr[i][j]="F";	
            	}	
            	else{
            	    arr[i][j]="0";	
            	}
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }
    }
}



