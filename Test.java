import java.util.*;

public class Test {
    public static void main (String[] args){
        System.out.println("Immetti un intero ");
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        input.close();
        System.out.println("Ho letto: " + x);
    }
}