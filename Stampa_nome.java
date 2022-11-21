import java.util.Scanner;
public class Stampa_nome {
    public static void main (String[] args){
    	
    	System.out.println("Immetti il tuo nome:");
    	Scanner input = new Scanner(System.in);
    	String nome = input.next();
    	input.close();
    
    	System.out.println("+--------+");
		System.out.println("+        +");
		System.out.println("+ "+nome+"  +");
		System.out.println("+        +");
		System.out.println("+--------+");
    }
}