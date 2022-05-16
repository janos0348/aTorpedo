
package torpedo;

import java.util.Random;

public class Torpedo {
    static String eredmeny;
    static int lovessekSzama;
    static int hajoHossz = 3;
    static Random rnd = new Random();
    
    public static void main(String[] args) {
       hajo hajo = new hajo(pozicioGenerator());
        System.out.println(hajo);
        loves(ellenorzes());
        
    }

    private static int[] pozicioGenerator() {
        int[] poz = new int[hajoHossz];
        for (int i = 0; i < hajoHossz; i++) {
            int reszHely = rnd.nextInt(6) + 1;
            poz[i]= reszHely;
            while (reszHely == poz[i-1]-1 || reszHely == poz[i-1]+1 && reszHely!=poz[i-1] && !(poz == null)) {
                poz[i]= reszHely;
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
