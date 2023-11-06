package org.example;
import java.util.Objects;
public class MobilniBroj extends  TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mreza , String br){
        this.mobilnaMreza=mreza;
        this.broj=br;
    }
    public String ispisi(){
        if(broj != null){
            return mobilnaMreza + "/" + broj;
        }
        else {
            return null;
        }
    }
    public int hashCode(){
        return Objects.hash(mobilnaMreza,broj);
    }
}
