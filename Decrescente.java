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
            }    		
    	}else {
    		System.out.println("Il numero non e' valido");
    	}
    	
    	boolean flag = true;
    	while(flag) {
    		if(n<=9999 || n>100000) {
    		System.out.println("Immetti un numero di 5 cifre:");
    		Scanner input2 = new Scanner(System.in);
    		int x = input2.nextInt();
	    		if(x>9999 && x<100000) {
	    			flag = false;
	    			while(n >= 150) {
	                	System.out.println(n);	
	                	n = n-2;
	            	}
	    		}else {
	        		System.out.println("Il numero non e' valido");
	        		input2.close();
	    		}
    		}
    		
    	}
    	input.close();
   }
}  
