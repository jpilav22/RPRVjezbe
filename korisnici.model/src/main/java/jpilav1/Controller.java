package jpilav1;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private ListView<Korisnik> listKorisnici;
    @FXML
    private TextField fldName;
    @FXML
    private TextField fldSurname;
    @FXML
    private TextField fldEmail;
    @FXML
    private TextField fldUsername;
    @FXML
    private PasswordField fldPassword;

    private KorisniciModel model;

    public Controller(KorisniciModel model) {
        this.model = model;
    }

    @FXML
    public void initialize() {
        fldName.textProperty().bindBidirectional(model.getTrenutniKorisnik().nameProperty());
        fldSurname.textProperty().bindBidirectional(model.getTrenutniKorisnik().surnameProperty());
        fldEmail.textProperty().bindBidirectional(model.getTrenutniKorisnik().emailProperty());
        fldUsername.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
        fldPassword.textProperty().bindBidirectional(model.getTrenutniKorisnik().passwordProperty());

        listKorisnici.setCellFactory(lv -> new ListCell<Korisnik>() {
            @Override
                    protected void updateItem(Korisnik korisnik, boolean empty) {
                super.updateItem(korisnik, empty);
                if (empty || korisnik == null) {
                    setText(null);
                } else {
                    int index = model.getKorisnici().indexOf(korisnik) + 1;
                    setText("Korisnik " + index + " - " + korisnik.getName());
                }
            }
        });

        listKorisnici.setItems(model.getKorisnici());

        listKorisnici.getSelectionModel().selectedItemProperty().addListener((obs, oldKorisnik, newKorisnik) -> {
            model.setTrenutniKorisnik(newKorisnik);
            listKorisnici.refresh();
        });
    }

    @FXML
    public void dodaj() {
        String name = fldName.getText();
        String surname = fldSurname.getText();
        String email = fldEmail.getText();
        String username = fldUsername.getText();
        String password = fldPassword.getText();

        model.napuni(name, surname, email, username, password);

        listKorisnici.refresh();

        // Set newly added as current
        Korisnik newKorisnic = model.getKorisnici().get(model.getKorisnici().size() - 1);
        model.setTrenutniKorisnik(newKorisnic);
    }


    @FXML
    public void kraj() {
        Stage stage = (Stage) listKorisnici.getScene().getWindow();
        stage.close();
    }

    // Professional names
    public KorisniciModel getModel() {
        return model;
    }
}