/*Scrivere una funzione che prenda in input da tastiera dei numeri e 
alla fine restituisca il maggiore (Per finire il programma inserire 0)*/

import java.util.Scanner;
import java.util.Collection;
public class Funzione {
    public static void main (String[] args){	
    	somma();
    }
    
    public static void somma(){
    	boolean flag=true;
    	int n = 0;
    	List<E> l;
    	while(flag) {
    		@SuppressWarnings("resource")
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Inserisci un numero:");
	    	double a = input.nextDouble();
	    	n=n+1;
	    	System.out.println(n);
	    	listaNumeri[0]=a;
	    	System.out.println(listaNumeri[0]);
	    	double maxNum = listaNumeri[0];
	    	for(double k : listaNumeri) {
	    		if(k<maxNum){
	    		maxNum=k;
	    		}
	    	}
	    	System.out.println("Il numero massimo è:"+maxNum);
	    	if(a==0) {
	    		System.out.println("Programma chiuso");
	    		input.close();
	    		break;
	    	}
    	}
    }
}