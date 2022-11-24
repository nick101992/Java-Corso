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
    
    public void contaClick(){
    	this.numClick++;     
    }

    // Getters

    public String getStatoLampadina(){
        return this.statoLampadina;
    }
    public int getClicksMassimi(){
        return this.clicksMassimi;
    }
    public int getNumClick(){
        return this.numClick;
    }
    
    // Setters
    public void setStatoLampadina(String statoLampadina){
        this.statoLampadina = statoLampadina;
    }
    
}
