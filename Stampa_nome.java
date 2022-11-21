import java.util.Scanner;
public class Stampa_nome {
    public static void main (String[] args){
    	
    	System.out.println("Immetti il tuo nome:");
    	Scanner input = new Scanner(System.in);
    	String nome = input.next();
    	input.close();
    	
    	//Stampa prima riga
    	int caratteri_stringa = nome.length();
    	System.out.print("+");
    	for(int x=0; x<caratteri_stringa+1; x++) {
    		System.out.print(" - ");
    		if(x == caratteri_stringa) {
    			System.out.println("+");
    		}
    	}
    	//Stampa seconda riga
		System.out.print("|");
		for(int x=0; x<caratteri_stringa+1; x++) {
			System.out.print(" ");
		}
    	System.out.print(" "+nome);
    	for(int x=0; x<caratteri_stringa+1; x++) {
        	System.out.print(" ");
    		if(x == caratteri_stringa) {
    			System.out.println("|");
    		}
    	}
    	//Stampa terza riga
		System.out.print("+");
		for(int x=0; x<caratteri_stringa+1; x++) {
    		System.out.print(" - ");
    		if(x == caratteri_stringa) {
    			System.out.print("+");
    		}
    	}	
    }
}