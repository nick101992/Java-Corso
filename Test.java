import java.util.*;

public class Test {
    public static void main (String[] args){
    	
    	
    	System.out.print("Immetti numero della serie Fibonacci:");
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	input.close();
    	
    	if(n <= 0){
    		System.out.print("Immetti un numero maggiore o uguale ad 1");
    	}
    	int x = 0;
    	
    	if(n == 1){
    		System.out.print(x);
    	}
        int y = 1;
        
        if(n >= 2){
        	System.out.print(x+",");
        	if(n == 2)
        	System.out.print(y);
        	else
        	System.out.print(y+",");
    	}
        
        if(n > 2){
	        for(int z=0; z<n ; z++) {
	        	int somma = x+y;
	        	x = y;
	        	y = somma;
	        	if(z < (n-1)){
	        		System.out.print(y+",");
	        	}
	        	else
	        		System.out.print(y);
	        }
        }
    }
}