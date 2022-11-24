package classijava;
public class Test {
    public static void main(String[] args) {
        
        Movimento m = new Movimento(1, "Giugno", 1000, "stipendio");
        Persona p1 = new Persona("Mario", "Rossi",28);
        ContoCorrente c1 =  new ContoCorrente(1, p1);
        c1.deposita(m);
        c1.getMovimenti();
    }
    
}
