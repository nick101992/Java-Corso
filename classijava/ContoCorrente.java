package classijava;
public class ContoCorrente{
    
    // Attributi
    private int codice;
    private Persona intestatario;
    private int saldo;
    private int numeroMovimenti;
    private Movimento[] movimenti;


    // Costruttore
    public ContoCorrente(int codice, Persona intestatario) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = 0;
        this.numeroMovimenti = 0;
        this.movimenti = new Movimento[1];
    }

    // Metodi
    public void deposita(Movimento movimento) {
        this.saldo += movimento.getImporto();
        this.numeroMovimenti++;
      	this.movimenti[numeroMovimenti-1]=movimento;      
    }

    public void preleva(int importo) {
        this.saldo -= importo;
        this.numeroMovimenti++;
    }

    // Getters
    public int getSaldo(){
        return this.saldo;
    }
    public int getCodice(){
        return this.codice;
    }
    public Persona getIntestatario(){
        return this.intestatario;
    }
    public int getNumeroMovimenti(){
        return this.numeroMovimenti;
    }
    public void getMovimenti(){
        for (int i = 0; i < movimenti.length; i++) {
        	  System.out.println(movimenti[i]);
        	}
    }

    // Setters
    public void setIntestatario(Persona intestatario){
        this.intestatario = intestatario;
    }
}