package lv2zad3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        List<Double> brojevi = new ArrayList<Double>();
        while(true)

        {
            System.out.print("Unesite broj ili rijec stop: ");
            String line = scanner.nextLine();
            if ("stop".equalsIgnoreCase(line.trim())) {
                break;
            }
            try{
                Double broj=Double.parseDouble(line);
                brojevi.add(broj);
            }
            catch(Exception e){
                System.out.println("Uneseni string nije broj");

            }
        }


System.out.println("Srednja vrijednost brojeva: "+ Lista.srednjaVrijednost(brojevi));
        System.out.println("Maksimalan clan liste: "+ Lista.miximalan((brojevi)));
        System.out.println("Minimalan clan liste: "+ Lista.minimalan(brojevi));
        System.out.println("Standardna devijacija brojeva: " + Lista.standardnaDrvijacija(brojevi));

    }

}

