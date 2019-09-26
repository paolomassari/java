
package esercizio2_78;

import javax.swing.JOptionPane;

public class Test {
        public static void main(String[] args) {
        
            String secondiS = JOptionPane.showInputDialog(null, 
                    "inserisci secondi ");
            int secondi = Integer.parseInt(secondiS);
            String minutiS = JOptionPane.showInputDialog(null, 
                    "inserisci minuti ");
            int minuti = Integer.parseInt(minutiS);
            String gradiS = JOptionPane.showInputDialog(null, 
                    "inserisci gradi ");
            int gradi = Integer.parseInt(gradiS);
            
            Angolo alpha = new Angolo (gradi, minuti, secondi);
            Angolo beta = new Angolo (2, 4, 59);
            Angolo gamma = null;
            alpha.aggiungiSecondi(2);
            
            Programma prg = new Programma();
            
            System.out.println( alpha );
            if ( beta != null )
                gamma = new Angolo ( beta );

    }

}
