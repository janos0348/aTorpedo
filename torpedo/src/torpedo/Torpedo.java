
package torpedo;

import java.util.Random;

public class Torpedo {
    static talalat eredmeny;
    static int lovessekSzama;
    static int hajoHossz = 3;
    static Random rnd = new Random();
    
    public static void main(String[] args) {
       hajo hajo = new hajo(pozicioGenerator());
        for (int i : pozicioGenerator()) {
            System.out.println(i);
        }
        loves(ellenorzes());
        
    }

    private static int[] pozicioGenerator() {
        int[] poz = new int[hajoHossz];
        for (int i = 0; i < hajoHossz; i++) {
            int reszHely = rnd.nextInt(6) + 1;
            poz[i]= rnd.nextInt(6) + 1;
            while (reszHely == poz[i]-1 || reszHely == poz[i]+1 && reszHely!=poz[i] && !(poz == null)) {
                poz[i]= reszHely;
            }
        }
        return poz;
    }

    private static void loves(talalat talalat) {
        while ( !(talalat == talalat.NEMTALALT)) { 
            
            lovessekSzama++;
        }
    }

    private static talalat ellenorzes() {
        eredmeny = talalat.SULYEDT;
        return eredmeny;
    }
    
}
