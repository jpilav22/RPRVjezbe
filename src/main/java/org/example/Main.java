package org.example;
public class Main {
    public static void main(String [] args)

    {
        InformacijeOStudentu student = new InformacijeOStudentu();
        student.setIme("Marko");
        student.setPrezime("Markovic");
        student.setGodinaStudija("3. godina");
        student.setBrojIndexa("12345");

        System.out.println("Student: " + student.getIme() + " " + student.getPrezime());
        System.out.println("Godina studija: " + student.getGodinaStudija());
        System.out.println("Broj indexa: " + student.getBrojIndexa());

        // Testiranje InformacijeONastavniku
        InformacijeONastavniku nastavnik = new InformacijeONastavniku();
        nastavnik.setIme("Profesor");
        nastavnik.setPrezime("Profesoric");
        nastavnik.setTitula("Docent");

        System.out.println("\nNastavnik: " + nastavnik.getIme() + " " + nastavnik.getPrezime());
        System.out.println("Titula: " + nastavnik.getTitula());

    }


}
