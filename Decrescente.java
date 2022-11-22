import java.util.Scanner;

public class Decrescente {
    public static void main (String[] args){
    	stampaNumDecrescenti(); 
    }
    
    public static void stampaNumDecrescenti(){
    	
    	System.out.println("Immetti un numero di 5 cifre:");
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int k = n;
    	if(k>9999 && k<100000) {
        	while(k >= 150) {
            	System.out.println(k);	
            	k = k-2;
                input.close();
            }    		
    	}else {
    		System.out.println("Il numero non e' valido");
    	}
    	
    	boolean flag = true;
        if(n<=9999 || n>100000) {
            while(flag) {
                System.out.println("Immetti un numero di 5 cifre:");
                Scanner input2 = new Scanner(System.in);
                int x = input2.nextInt();
                if(x>9999 && x<100000) {
                    flag = false;
                    while(x >= 150) {
                        System.out.println(x);	
                        x = x-2;
                        input.close();
                        input2.close();
                    }
                }else {
                    System.out.println("Il numero non e' valido");		
                }
            }
    	}
   }
}
