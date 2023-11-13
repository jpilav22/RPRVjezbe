package org.example;

public class InformacijeONastavniku extends LicneInformacije implements  Predstavljiv {

    private String titula;

    public void setTitula(String titula) {
        this.titula = titula;
    }


    public String getTitula() {
        return titula;
    }

    public String predstavi(){
        return "nesto";
    }

}
