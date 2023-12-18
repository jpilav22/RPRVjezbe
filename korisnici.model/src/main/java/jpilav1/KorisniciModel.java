package jpilav1;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici;
    private SimpleObjectProperty<Korisnik> trenutniKorisnik;

    public KorisniciModel() {
        korisnici = FXCollections.observableArrayList();
        trenutniKorisnik = new SimpleObjectProperty<>(new Korisnik("First", "Last", "email@domain.com", "customer123", "password"));
    }

    public void napuni(String name, String surname, String email, String username, String password) {
        korisnici.add(new Korisnik(name, surname, email, username, password));
    }

    // getters and setters
    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }
}