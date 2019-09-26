
package esercizio2_78;

public class Programma {
    private String denominazione; 
    private String produttore;
    private String versione;
    private String so; 
    private int anno;

    public boolean equals(Programma prg) {
        if ( this.denominazione.equals(prg.getDenominazione()) && 
                this.produttore.equals(prg.produttore) && 
                this.so.equals(prg.so) && 
                this.versione.equals(prg.versione) && 
                this.anno == prg.anno )
            return true;
        return false;
    }

    public Programma() {
    }

    
    public Programma(String denominazione, String produttore, String versione, String so, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.so = so;
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public String getDenominazione() {
        return denominazione;
    }
    
    
    
    
}
