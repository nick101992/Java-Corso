import java.util.Scanner;
import java.util.Arrays;
public class MatriceQuadrata{
    public static void main (String[] args){
    	stampaMatrice(6,"F");
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



