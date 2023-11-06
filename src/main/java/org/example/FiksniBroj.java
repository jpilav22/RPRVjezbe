package org.example;
import java.util.Objects;
public class FiksniBroj extends  TelefonskiBroj {
    private String broj;
   private Grad grad;

    FiksniBroj(Grad grad, String broj){
        if(grad==null) throw new brojException("Pogresan pozivni broj");
        this.grad=grad;
        this.broj=broj;
    }

    public String ispisi(){
        if(this.grad!=null && this.broj!=null){
            return grad.getPozivniBroj() + "/" + broj;
        }

    return null;

    }
    public int hashCode(){
        return Objects.hash(grad,broj);

    }

    public Grad getGrad() {
        return this.grad;
    }


}
