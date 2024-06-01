
package huszonegyjatek;


public class HuszonegyJatek {
    public static int[] jatekos = new int[2],gep = new int[2];

    public static void main(String[] args) {
        feladat();
    
    
    }

    private static void feladat() {
    tombFeltoltes();   
    tombKiir();
    bekeres();
    }

    private static void tombFeltoltes() {
        tombFeltoltesJatekos();
        tombFeltoltesGep();
    }
    private static void tombKiir() {
        tombKiirJatekos();
        osszegzesJatekos();
        tombKiirGep();
        osszegzesGep();
    }

    private static void tombFeltoltesJatekos() {
        int felso = 11;
        int also = 2;
        for (int i = 0; i < jatekos.length; i++) {
            jatekos[i] = (int)(Math.random() * (felso - also + 1)) + also;
        }
    
    }

    private static void tombFeltoltesGep() {
       int felso = 11;
        int also = 2;
        for (int i = 0; i < gep.length; i++) {
            gep[i] = (int)(Math.random() * (felso - also + 1)) + also;
        } 
    }

    private static void tombKiirJatekos() {
        System.out.print("A jatekos lapjai: ");
        for (int i = 0; i < jatekos.length; i++) {
            System.out.print(jatekos[i] + " ");
        }
        System.out.println("");
    
    }
     private static void osszegzesJatekos() {
         int osszeg = 0;
         for (int i = 0; i < jatekos.length; i++) {
             osszeg += jatekos[i];
         }
         System.out.println("A jatekos lapjainak osszege: " + osszeg);
     }
     
    private static void tombKiirGep() {
        System.out.print("A gep lapjai: ");
        for (int i = 0; i < gep.length; i++) {
            System.out.print(gep[i] + " ");
        }
        System.out.println("");
    }
    private static void osszegzesGep() {
        int osszeg = 0;
         for (int i = 0; i < gep.length; i++) {
             osszeg += gep[i];
         }
         System.out.println("A gep lapjainak osszege: " + osszeg);
    
    }
    
    private static void bekeres() {
        
    }
    
}
