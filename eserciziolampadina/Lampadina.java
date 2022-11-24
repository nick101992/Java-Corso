package eserciziolampadina;

public class Lampadina{
    
    // Attributi
	private int clicksMassimi;
    private String statoLampadina;
    private int numClick;
    // Costruttore
    public Lampadina (int clicksMassimi) {
        this.statoLampadina = "Spenta";
        this.clicksMassimi = clicksMassimi;
        this.numClick = 0;
    }

    // Metodi
    public String stato() {
    	System.out.println("Lo stato della lampadina e': "+this.statoLampadina);
    	System.out.println("");
    	return this.statoLampadina;
    }
    
    public void click(){
    	this.numClick++;
        if(this.statoLampadina.equals("Spenta") && this.numClick <= this.clicksMassimi) {
        	this.statoLampadina = "Accesa";
        }
        else if (this.statoLampadina.equals("Accesa") && this.numClick <= this.clicksMassimi) {
        	this.statoLampadina = "Spenta";
		}
        else {
        	this.statoLampadina = "Rotta";
        }        
    }

    // Getters

    public int getNumClick(){
        return this.numClick;
    }
}
