/*Scrivere una funzione che somma tra loro tutti i numeri che 
prende in input da tastiera (0 per chiudere il programma)*/

import java.util.Scanner;
public class Sommatrice {
    public static void main (String[] args){	
    	somma();
    }
    
    public static void somma(){
    	boolean flag=true;
    	double x = 0;
    	
    	while(flag) {
    		@SuppressWarnings("resource")
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Inserisci un numero:");
	    	double a = input.nextDouble();
	    	x=x+a;
	    	System.out.println("La somma dei numeri inseriti e':"+x);
	    	if(a==0) {
	    		System.out.println("Programma chiuso");
	    		input.close();
	    		break;
	    	}
    	}
    }
}