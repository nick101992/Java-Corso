package eserciziolampadina;

import java.util.Scanner;

public class TestInterruttore {
    public static void main(String[] args) {
    	
    	Lampadina lamp1 =  new Lampadina(2);
    	Interruttore inter1 = new Interruttore(1,lamp1);
    	Interruttore inter2 = new Interruttore(2,lamp1);
    	Scanner input = new Scanner(System.in);
    	boolean flag=true;
    	while(flag) {
	    	System.out.println("Scrivi 1 per premere l'interruttore 1 oppure");
	    	System.out.println("Scrivi 2 per premere l'interruttore 2 oppure ");
	    	System.out.println("Scrivi exit per terminare l'esecuzione ");
	    
	    	String codiceInserito = input.next();
	    	
	    	switch(codiceInserito) {
	    	
	    	case "1":
	    		inter1.click();
	    		if (lamp1.getNumClick() > lamp1.getClicksMassimi()){
	    			System.out.println("La Lampadina si e' rotta!");
	    			System.out.println("Programma chiuso");
		    		input.close();
		    		break; 
		    	}
	    		System.out.println("Interruttore 1 premuto!");
	    		lamp1.stato();
	    		break;
	    		
    	    case "2":
	    		inter2.click();
	    		System.out.println("Interruttore 2 premuto!");
	    		lamp1.stato();
	    		break;
	    		
    	    case "exit":
	    		System.out.println("Programma chiuso");
	    		input.close();
	    		break;
	    		
	    	default:
	    		System.out.println("Comando errato");
	    		break;	
	    	}
	    	
		    if (lamp1.getNumClick() > lamp1.getClicksMassimi()){
		    	break; 
		    }
    	}
    }
}