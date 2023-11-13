package org.example;
import java.util.*;
public class KolekcijaImena {
    private ArrayList<String>imena;
    public String getNajduzeIme(){
        String najduzi=this.imena.getFirst();
        for(String i : this.imena){
            if(i.length()>najduzi.length()) najduzi=i;

        }
        return najduzi;
    }

}
