/*Scrivere una funzione che presa in input una parola,
 * restituisca True or False se è contenuta nel file*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CercaParoleTesto{
    public static void main (String[] args){
    	System.out.println("Scrivi parola da ricercare:");
    	Scanner input = new Scanner(System.in);
    	String parola = input.next();
    	input.close();
    	ricercaTesto(parola);
    }
        
    public static boolean ricercaTesto (String parola) {
			String path ="C:\\Users\\Niccolo\\git\\Java-Corso\\test.txt";
    		path = path.replace("\\", "/");
        	File leggi = new File (path);
        	int num_riga=0;
            try {
                Scanner sc = new Scanner(leggi);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    num_riga=num_riga+1;
                    String[] array = line.replaceAll("[^a-zA-Z ]", "")
                    					 .toLowerCase()
                    					 .split("\\s+");
                    for (int i = 0; i < array.length; i++) {
                    	if (array[i].equalsIgnoreCase(parola)) {
                    		sc.close();
                    		System.out.println("Parola Trovata nella riga "+num_riga);
                    		return true;
                    	}
                    }                    
                }
                sc.close();      
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Parola non trovata");
			return false;       
    }
}