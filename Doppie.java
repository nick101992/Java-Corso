import java.util.Scanner;

/*Scrivere una funzione che prende in input una
stringa e restituisce true o false se ci sono
doppie*/
public class Doppie {
    public static void main (String[] args){
    	System.out.println("Immetti una stringa:");
    	Scanner input = new Scanner(System.in);
    	String nome = input.next();
    	input.close();
    	ciSonoDoppie(nome);
    }
    
    public static boolean ciSonoDoppie(String frase){
    boolean risultato=false;
    int numCaratteri=frase.length();
    
    for(int x=0;x<numCaratteri;x++) {
    	if(x != (numCaratteri-1)) {
	    	if (frase.charAt(x)==frase.charAt(x+1)) {
	    		System.out.println("Ci sono doppie");
	    		risultato=true;
	    	}	 	
    	}
    }
    System.out.println("Non ci sono doppie");
	return risultato;
	}
}