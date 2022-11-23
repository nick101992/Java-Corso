/*Riempire una matrice quadrata di una dimensione random di interi casuali
 da dare in input ad una seconda funzione che calcola la media degli elementi
 della matrice e crea una matrice con solo i numeri maggiori di tale media
 (anche questa deve essere quadrata, riempire con 0 le caselle in più*/

import java.util.Random;
public class MatriceQuadrataCasuale{
    public static void main (String[] args){    	
    	mediaMatrice(stampaMatrice(6));
    }
    
    public static int[][] stampaMatrice(int dim_matrice){
    	System.out.println("Matrice quadrata di numeri random da 0-9:");
    	int[][] arr = new int[dim_matrice][dim_matrice];
    	Random ran = new Random();
        for (int i = 0; i < dim_matrice; i++){
            for (int j = 0; j < arr[i].length; j++){
            	arr[i][j]=ran.nextInt(10); // Ritorna numeri tra 0-9
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
    
    public static void mediaMatrice(int[][] matrice){
    	//Calcolo la media dei numeri della matrice
    	int dim_matrice = matrice[0].length;
    	int num_elementi = dim_matrice*dim_matrice;
    	double somma = 0;
    	
        for (int i = 0; i < dim_matrice; i++){
            for (int j = 0;  j < matrice[i].length; j++){
            	somma = somma + matrice[i][j];
            }
        }
        double media = somma/num_elementi;
        long arrontonda_media = Math.round(media);
        //Random ran = new Random();
        //Costruisco matrice con solo i numeri maggiori della media
        System.out.println();
        System.out.println("Somma numeri:" +somma);
        System.out.println("Numero elementi:" +num_elementi);
        System.out.println("Media:" +media);
        System.out.println("Media arrotondata:" +arrontonda_media);
        System.out.println();
        System.out.println("Matrice con solo numeri compresi tra la media e 9:");
        for (int i = 0; i < dim_matrice; i++){
            for (int j = 0; j < matrice[i].length; j++){
            	if (matrice[i][j] <= arrontonda_media ) {
            		matrice[i][j]=0;
            		System.out.print(matrice[i][j] + " ");
            	}
            	else {
            		/*Se non voglio gli stessi numeri maggiori della media
            		*della matrice precendente tolgo il commento alla riga 39 e 
            		*alla riga 58 che ritorna numeri random tra la media e 9*/
            		//matrice[i][j]= ran.nextInt((int)arrontonda_media,10);
            		System.out.print(matrice[i][j] + " ");
            	}
            }
            System.out.println();
        }               
    }   
}
