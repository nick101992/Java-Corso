/*Scrivere un programma che legge tutte le righe presenti in un file
 * e le scrive in un altro file inserendo per ciascuna riga il corrispondente
 * numero di riga*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile{
    public static void main (String[] args){
		String path ="C:\\Users\\Niccolo\\git\\Java-Corso\\test.txt";
    	path = path.replace("\\", "/");
    	leggiScriviNuovoFile(path);
    }
        
    public static void leggiScriviNuovoFile(String path) { 	
    	try {
        	File leggi = new File (path);
            FileWriter scrittore = new FileWriter("file_scritto.txt");
            int num_riga=0;
            try {
                Scanner sc = new Scanner(leggi);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    num_riga=num_riga+1;
                    scrittore.write(line+" | riga"+num_riga+"\n");
                }       
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            scrittore.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException errore) {
            System.out.println("Errore:" + errore.getMessage());
        }
    }
}

    