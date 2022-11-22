import java.util.Arrays;
public class ArrayEliminaElemento{
    public static void main (String[] args){
    	int[] lista = {1,2,3,4,5,6,7,8,9,10};
    	rimuoviElemento(lista,0);
    	rimuoviElemento(lista,1);
    	rimuoviElemento(lista,2);
    	rimuoviElemento(lista,3);
    	rimuoviElemento(lista,4);
    	rimuoviElemento(lista,5);
    	rimuoviElemento(lista,6);
    	rimuoviElemento(lista,7);
    	rimuoviElemento(lista,8);
    	rimuoviElemento(lista,9);
    	rimuoviElemento(lista,10);
    }
    
    public static int[] rimuoviElemento(int[] lista, int posizione){
    	int[] lista2 = new int[lista.length-1];
    	for(int x=0;x<lista.length-1;x++){
    		if(posizione == 10) {
    			lista2[x] = -1;
    		}
    		else if(x >= posizione && posizione != 10) {
	    		lista2[x] = lista[x+1];
	    	}
    		else {
	    		lista2[x] = lista[x];
	    	}
    	}
    	System.out.println(Arrays.toString(lista2));
    	return lista2;
    }
}