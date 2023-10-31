package org.example;
import java.util.List;
public class Banka {
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;
    private long brojRacnuna;

    public Banka() {
    }
   public Korisnik kreirajNovogKorisnika(String ime , String prezime){
        Korisnik novi=new Korisnik(ime , prezime);
        this.korisnici.add(novi);
        return novi;
    }

    public Uposlenik kreirajNovogUposlenika(String ime , String prezime){
        Uposlenik novi=new Uposlenik(ime , prezime);
        this.uposlenici.add(novi);
        return novi;
    }


}
