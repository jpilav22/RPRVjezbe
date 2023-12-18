package jpilav1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        KorisniciModel model = new KorisniciModel();
        model.napuni("Jasmina", "Pilav", "jpilav2@etf.unsa.ba", "1111", "example");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/jpilav1/form.fxml"));
        // creates an instance of
        // fx:controller="jpilav1.korisnic.Controller"
        loader.setController(new Controller(model));
        Parent root = loader.load();
        primaryStage.setTitle("Korisnik");
        primaryStage.setScene(new Scene(root, 550, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}