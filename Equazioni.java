/*Esercizio per risolvere equazioni di secondo grado
 del tipo ax^2+bx+c=0*/
import java.util.*;
public class Equazioni {
    public static void main (String[] args){
    	Scanner input = new Scanner(System.in);
    	Scanner input2 = new Scanner(System.in);
    	Scanner input3 = new Scanner(System.in);
    	System.out.println("Inserisci a:");
    	double a = input.nextDouble();
    	
    	System.out.println("Inserisci b:");
    	double b = input2.nextDouble();

    	System.out.println("Inserisci c:");
    	double c = input3.nextDouble();
    	input.close();
    	input2.close();
    	input3.close();
    	
    	equazioneSecondoGrado(a, b, c);
    }
   
    public static void equazioneSecondoGrado(double a, double b, double c){
    	double delta = (Math.pow(b, 2) - (4*a*c));
    	if (delta > 0) {
    		double x1 = (-b + Math.sqrt(delta))/(2*a);
    		double x2 = (-b - Math.sqrt(delta))/(2*a);
    		System.out.println("I risultati dell'equazione sono:");
    		System.out.println("x1:"+ x1);
    		System.out.println("x2:"+ x2);
    	}
    	else if (delta == 0) {
    		double x = (-b + Math.sqrt(delta))/(2*a);
    		System.out.println("Il risultato dell'equazione sono:");
    		System.out.println("x1=x2:"+ x);
    	}
    	else {
    		System.out.print("Il delta e' negativo, quindi l'equazione non ha radici reali");
    	}
    }
    
}