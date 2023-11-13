package org.example;

public class InformacijeOStudentu extends LicneInformacije implements Predstavljiv {

    private String brojIndexsa;
    private String godinaStudija;



    public String getBrojIndexa() {
        return brojIndexsa;
    }

    public void setBrojIndexa(String brojIndexsa) {
        this.brojIndexsa = brojIndexsa;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    public String predstavi(){
        return "nesto";
    }
}
