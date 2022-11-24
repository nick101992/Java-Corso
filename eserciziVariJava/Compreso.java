/*Inserire tre numeri A, B e C dire se B è compreso
tra A e C*/

import java.util.Scanner;
public class Compreso {
    public static void main (String[] args){	
    	maxNumber();
    }
    
    public static void maxNumber(){
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
    	if((b <= a && b >= c) || (b >= a && b < c)) {
    		System.out.println("Il numero b "+b+" e' compreso tra a e b");
    	}
    	else {
    		System.out.println("Il numero b "+b+" non e' compreso tra a e b");
    	}
    }
}