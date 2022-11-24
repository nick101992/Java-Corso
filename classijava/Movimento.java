package classijava;
import java.util.Date;
public class Movimento {
	
	// Attributi
	private int idMovimento;
    private String dataMovimento;
    private int importo;
    private String descrizioneMovimento;
   
    // Costruttore
    public Movimento(int idMovimento, String dataMovimento, int importo, String descrizioneMovimento ){
        this.idMovimento = idMovimento;
        this.dataMovimento = dataMovimento;
        this.importo = importo;
        this.descrizioneMovimento = descrizioneMovimento;
        
    }
    

    
    // Getters
    public int getImporto() {
        return this.importo;
    }
}
