package org.example;
import java.util.*;
public class Pobjednik {
    private String ime;
    private String prezime;
    private int brojZnakova=ime.length();
    private KolekcijaImena kolekcijaImena;
    public Pobjednik(KolekcijaImena kolekcija){
        String najduze=new String (kolekcija.getNajduzeIme());
        String [] razdjeljeni=najduze.split("\s+");
       this.ime=new String(razdjeljeni[0]);
       this.prezime=new String(razdjeljeni[1]);
       this.brojZnakova=ime.length();

    }

}
