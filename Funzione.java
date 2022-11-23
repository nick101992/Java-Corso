/*Scrivere una funzione che prenda in input da tastiera dei numeri e 
alla fine restituisca il maggiore (Per finire il programma inserire 0)*/

import java.util.Scanner;
public class Funzione {
    public static void main (String[] args){	
    	somma();
    }
    
    public static void somma(){
    	boolean flag=true;
    	double maxNum = 0;
    	while(flag) {
    		@SuppressWarnings("resource")
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Inserisci un numero:");
	    	double a = input.nextDouble();
	    	if(a<maxNum && a!=0){
	    		System.out.println("Il numero massimo e':"+maxNum);
	    	}
	    	else if(a==0){
	    		System.out.println("Programma chiuso");
	    		input.close();
	    		break;
	    	}
	    	else {
	    		System.out.println("Il numero massimo e':"+a);
	    		maxNum = a;
	    	}
    	}
    }
}