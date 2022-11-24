/*Scrivere una funzione che prende due numeri come
parametro e manda in print il più grande tra i due*/

import java.util.Scanner;
public class Stampa_max {
    public static void main (String[] args){	
    	maxNumber();
    }
    
    public static double maxNumber(){
    	Scanner input = new Scanner(System.in);
    	Scanner input2 = new Scanner(System.in);
    	System.out.println("Inserisci a:");
    	double a = input.nextDouble();
    	System.out.println("Inserisci b:");
    	double b = input2.nextDouble();
    	input.close();
    	input2.close();
    	if(a>b) {
    		System.out.println("Il numero "+a+" e' il piu' grande");
    		return a;
    	}
    	else {
    		System.out.println("Il numero "+b+" e' il piu' grande");
    		return b;
    	}
    }
}