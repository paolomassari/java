package esercizio2_78;

import javax.swing.JOptionPane;

public class Angolo {
    int gradi;
    int primi;
    int secondi;
    public Angolo(int gradi, int primi, int secondi) {
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    public Angolo( Angolo angolo ) {
        this.secondi = angolo.secondi;
        this.primi = angolo.primi;
        this.gradi = angolo.getGradi();
    }
    
    public int getGradi() {         return gradi;     }
    public int getPrimi() { return primi;     }
    public int getSecondi() {         return secondi;     }    
    public boolean equals(Angolo o) {
        if ( o.gradi == this.gradi && 
                o.getPrimi() == this.primi && 
                o.secondi == this.secondi )
            return true; 
        return false;
    }
    public void aggiungiGradi( int gg ) {
        this.gradi += gg;
        this.gradi = this.gradi % 360;
        return;
    }
    public void aggiungiPrimi( int mm ) {
        this.primi += mm;
        aggiungiGradi(this.primi / 60 );
        this.primi = this.primi % 60;
        return;
    }
    public void aggiungiSecondi ( int ss )  {
        this.secondi += ss;
        aggiungiPrimi(this.secondi / 60);
        this.secondi = this.secondi % 60;
    }
// overRide
    public String toString() {
        return "" + this.gradi + ":" +
                this.primi + ":" + 
                this.secondi; 
    }
    public int angoloSecondi() {
        return this.secondi + this.primi * 60 + this.gradi * 3600;
    }
    public int differenzaSecondi ( Angolo angolo ) {
        return Math.abs(this.angoloSecondi() - angolo.angoloSecondi());
    }
    public void sommaAngolo ( Angolo angolo ) {
        aggiungiSecondi( angolo.angoloSecondi() );
    }
    
    
    
}

    
    
    
    

