
public class Test {
    public static void main (String[] args){
        int x = 0;
        int y = 1;
        System.out.print(x+",");
        System.out.print(y+",");
        for(int z=0; z<5 ; z++) {
        	int somma = x+y;
        	x = y;
        	y = somma;
        	if(z<4){
        		System.out.print(y+",");
        	}
        	else
        		System.out.print(y);
        }
    }
}
