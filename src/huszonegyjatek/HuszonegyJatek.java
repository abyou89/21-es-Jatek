
package huszonegyjatek;


public class HuszonegyJatek {
    public static int[] j = new int[2],g = new int[2];

    public static void main(String[] args) {
        feladat();
    
    
    }

    private static void feladat() {
    tombFeltoltes();   
    tombKiir();
    }

    private static void tombFeltoltes() {
        tombFeltoltesJatekos();
        tombFeltoltesGep();
    }
    private static void tombKiir() {
        tombKiirJatekos();
    }

    private static void tombFeltoltesJatekos() {
        int felso = 11;
        int also = 2;
        for (int i = 0; i < j.length; i++) {
            j[i] = (int)(Math.random() * (felso - also + 1)) + also;
        }
    
    }

    private static void tombFeltoltesGep() {
       int felso = 11;
        int also = 2;
        for (int i = 0; i < g.length; i++) {
            g[i] = (int)(Math.random() * (felso - also + 1)) + also;
        } 
    }

    private static void tombKiirJatekos() {
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i] + " ");
        }
        System.out.println("");
    
    }
    
}
