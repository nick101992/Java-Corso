import java.util.Scanner;

public class Decrescente {
    public static void main (String[] args){
    	stampaNumDecrescenti(); 
    }
    
    public static void stampaNumDecrescenti(){
    	System.out.print("Immetti un numero di 5 cifre:");
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	input.close();
  	
    	while(n >= 150) {
    	System.out.println(n);	
    	n = n-2;
    	} 
    }
}  
