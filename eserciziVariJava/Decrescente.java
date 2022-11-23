/*Scrivere un algoritmo che preso in input un numero
X a 5 cifre, visualizza in ordine decrescente i
numeri naturali da X a 150 a step di 2. Stampare
“ERRORE” in caso il numero inserito non rispetta i
requisiti e ripetere l’inserimento*/

import java.util.Scanner;

public class Decrescente {
    public static void main (String[] args){
    	stampaNumDecrescenti(); 
    }
    
    public static void stampaNumDecrescenti(){    	
    	System.out.println("Immetti un numero di 5 cifre:");
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	if(n>9999 && n<100000) {
        	while(n >= 150) {
            	System.out.println(n);	
            	n = n-2;
                input.close();
            }    		
    	}else {
    		System.out.println("Il numero non e' valido");
            boolean flag = true;
            while(flag) {
                System.out.println("Immetti un numero di 5 cifre:");
                int x = input.nextInt();
                if(x>9999 && x<100000) {
                    flag = false;
                    while(x >= 150) {
                        System.out.println(x);	
                        x = x-2;
                        input.close();
                    }
                }else {
                    System.out.println("Il numero non e' valido");		
                }
            }
    	}
    }
}
