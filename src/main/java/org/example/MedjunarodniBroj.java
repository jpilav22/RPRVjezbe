package org.example;
import java.util.Objects;
public class MedjunarodniBroj extends TelefonskiBroj {
    private String broj;
    private String drzava;

    public MedjunarodniBroj(String drzava , String broj) {
        this.drzava = drzava;
        this.broj=broj;
    }
    public String ispisi(){
        if(broj!=null){
            return drzava+broj;
        }
        return null;
    }

    public String getBroj() {
        return broj;
    }
    public int hashCode(){
        return Objects.hash(broj,drzava);
    }

}
