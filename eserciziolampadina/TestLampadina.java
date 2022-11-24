package eserciziolampadina;
import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
    	
    	System.out.println("Scrivi numero click massimo della lampadina:");
    	Scanner input = new Scanner(System.in);
    	int numClickMassimi = input.nextInt();
    	Lampadina l1 =  new Lampadina(numClickMassimi);
    	
    	boolean flag=true;
    	while(flag) {
	    	System.out.println("Scrivi 'stato' per sapere lo stato attuale della lampadina"
	    	+ " oppure 'click' per cambiare lo stato della lampadina");
	    	System.out.println("'exit' per chiudere il programma:");
	    	
	    	@SuppressWarnings("resource")
			Scanner input2 = new Scanner(System.in);
	    	String funzionalita = input.next();
	    	
	    	if (funzionalita.equalsIgnoreCase("stato")) {
	    		l1.stato();
	    	}
	    	else if (funzionalita.equalsIgnoreCase("click")) {
	    		l1.click();
	    		if (l1.getNumClick() > numClickMassimi )
	    		{
	    			System.out.println("Lampadina Rotta");
	    			System.out.println("Programma chiuso");
		    		input2.close();
		    		break;   			
	    		}
	    	}
	    	else if (funzionalita.equalsIgnoreCase("exit")) {
	    		System.out.println("Programma chiuso");
	    		input2.close();
	    		break;
	    	}
	    	else {
	    		System.out.println("Comando errato");
	    	}
    	}
    	input.close();
    }
    
}
