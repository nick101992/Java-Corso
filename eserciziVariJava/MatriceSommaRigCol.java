/*Riempiere una tabella di 4 righe e 3 colonne con interi pseudo-casuali
  compresi tra 1 e 9 (estremi inclusi). Per ciascuna riga della tabella
  visualizzare la somma degli interi su ciascuna colonna*/

import java.util.Random;
public class MatriceSommaRigCol{
    public static void main (String[] args){    	
    	stampaTabella();
    }
    
    public static void stampaTabella(){
    	int[][] arr = new int[4][3];
    	Random ran = new Random();
    	int sommaRiga=0;
    	int sommaColonna=0;
    	
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
            	arr[i][j]=ran.nextInt(1,10); // Ritorna numeri tra 1-9
            	System.out.print(arr[i][j] + "   ");
            	sommaRiga=sommaRiga+arr[i][j];
            	if (j==arr[i].length-1) {
            		System.out.print("|");
            		System.out.print(sommaRiga);
            		sommaRiga=0;
            	}
            }
            System.out.println();            
        }
        System.out.println("__  __  __");
        for (int j = 0; j < arr[0].length; j++){
            for (int i = 0; i < arr.length; i++){
            	sommaColonna=sommaColonna+arr[i][j];
            	if (i==arr.length-1) {
            		System.out.print(sommaColonna+"  ");
        			sommaColonna=0;
            	}
            }
        }
    }
}