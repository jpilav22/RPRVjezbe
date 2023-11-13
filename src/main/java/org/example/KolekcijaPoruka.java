package org.example;
import java.util.*;

public class KolekcijaPoruka {
    private ArrayList<String> poruke;

    public ArrayList<String> getPoruke() {
        return poruke;
    }
    KolekcijaPoruka(ArrayList<Predstavljiv>L){

     for(Predstavljiv o : L){
         ArrayList<String>poruke=new ArrayList<>();
         poruke.add(o.predstavi());
     }
    }
}
