package org.example;
import java.util.*;
public class KolekcijaImenaIPrezimena {
    private ArrayList<String>imena;
    private ArrayList<String>prezimena;
    int getIndexNajduzegPara(){
        int indexnajduzeg=0;




        for(int i=1; i<imena.size(); i++){
            if((imena.get(i)+prezimena.get(i)).length()>(imena.get(indexnajduzeg)+prezimena.get(indexnajduzeg)).length())
            {
                indexnajduzeg=i;

            }

        }
        return indexnajduzeg;
    }
    String GetImeIPretime(int i){
        String imeIPrezime=new String(imena.get(i)+prezimena.get(i));
        return imeIPrezime;
    }

}
