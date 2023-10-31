package org.example;

public class Racun {
private long brojRacuna;
private Osoba1 korisnikRacuna;
private boolean odobrenjePrekoracenja;
private double stanjeRacuna;
private double prekoracenje;

    public Racun(long brojRacuna , Osoba1 korisnikRacuna ) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }

    private boolean provjeriPdobrenjePrekoracenja(double iznos){
    return this.prekoracenje>iznos;

}
public boolean izvrsiUplatu(double iznos){
        this.stanjeRacuna+=iznos;
        return true;
}
    public boolean izvrsiIsplatu(double iznos){
        this.stanjeRacuna-=iznos;
        return true;
    }
    public void odobriPrekoracenje(double iznos){
        this.prekoracenje+=iznos;
    }
}
