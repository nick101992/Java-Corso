package eserciziolampadina;

public class Interruttore{
    
    // Attributi
	private Lampadina lampadina;
	private int idInterruttore;

    // Costruttore
    public Interruttore (int idInterruttore, Lampadina lampadina) {
    	this.idInterruttore = idInterruttore;
        this.lampadina = lampadina;
    }

    // Metodi
   
    public void click(){
    	lampadina.contaClick();
        if(lampadina.getStatoLampadina().equals("Spenta") && lampadina.getNumClick() <= lampadina.getClicksMassimi()) {
        	lampadina.setStatoLampadina("Accesa");
        }
        else if (lampadina.getStatoLampadina().equals("Accesa") && lampadina.getNumClick() <= lampadina.getClicksMassimi()) {
        	lampadina.setStatoLampadina("Spenta");
		}
        else {
        	lampadina.setStatoLampadina("Rotta");
        }        
    }
    
    // Getters

    public int getIdInterruttore(){
        return this.idInterruttore;
    }
}

