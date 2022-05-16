
package torpedo;

import java.util.Random;

public class Torpedo {
    static String eredmeny;
    static int lovessekSzama;
    static int hajoHossz = 3;
    static Random rnd = new Random();
    
    public static void main(String[] args) {
       hajo hajo = new hajo(pozicioGenerator());
        
        loves(ellenorzes());
        
    }

    private static int[] pozicioGenerator() {
        int[] poz = new int[hajoHossz];
        for (int i = 0; i < hajoHossz; i++) {
            poz[i]= rnd.nextInt(6) + 1;
            if (true) {
                
            }
        }
        return poz;
    }

    private static void loves(String talalat) {
        while ( !(talalat == "sulyedt")) { 
            
            lovessekSzama++;
        }
    }

    private static String ellenorzes() {
        eredmeny = "talalt";
        return eredmeny;
    }
    
}
