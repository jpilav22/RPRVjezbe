package lv2zad3;
import java.util.List;
import java.util.Collections;
public class Lista {
    public static Double srednjaVrijednost(List<Double>brojevi){
        double S=0;
        for(double i : brojevi){
            S+=i;


        }
        return S/=brojevi.size();

    }
    public static Double minimalan(List<Double>brojevi)
    {
        return Collections.min(brojevi);
    }
    public static Double miximalan(List<Double>brojevi)
    {
        return Collections.max(brojevi);
    }

    public static Double standardnaDrvijacija(List<Double>L){
        double StandardnaDevijacija=0;
        Double prosjek=Lista.srednjaVrijednost(L);
        for(double broj : L){
            StandardnaDevijacija+=Math.pow(broj-prosjek,2);

        }
        return StandardnaDevijacija;

    }
}
