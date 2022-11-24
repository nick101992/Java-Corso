package eserciziolampadina;
import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
    	
    	System.out.println("Scrivi numero click massimo della lampadina:");
    	Scanner input = new Scanner(System.in);
    	int numClickMassimi = input.nextInt();
    	Lampadina lamp1 =  new Lampadina(numClickMassimi);
    	Interruttore inter1 = new Interruttore(1,lamp1);
    	
    	boolean flag=true;
    	while(flag) {
	    	System.out.println("Scrivi 'stato' per sapere lo stato attuale della lampadina"
	    	+ " oppure 'click' per cambiare lo stato della lampadina");
	    	System.out.println("'exit' per chiudere il programma:");
	    	
	    	String funzionalita = input.next();
	    	
	    	if (funzionalita.equalsIgnoreCase("stato")) {
	    		lamp1.stato();
	    	}
	    	else if (funzionalita.equalsIgnoreCase("click")) {
	    		inter1.click();
	    		if (lamp1.getNumClick() > numClickMassimi )
	    		{
	    			System.out.println("Lampadina Rotta");
	    			System.out.println("Programma chiuso");
		    		input.close();
		    		break;   			
	    		}
	    	}
	    	else if (funzionalita.equalsIgnoreCase("exit")) {
	    		System.out.println("Programma chiuso");
	    		input.close();
	    		break;
	    	}
	    	else {
	    		System.out.println("Comando errato");
	    	}
    	}
    	input.close();
    }
    
}
