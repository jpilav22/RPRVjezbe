package jpilav1;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest extends ApplicationTest {
    private Controller controller;

    @Override
    public void start(Stage stage) throws Exception {
        KorisniciModel model = new KorisniciModel();
        model.napuni("ExampleName", "ExampleSurname", "example@email.com", "Example1111", "ExamplePassword");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/jpilav1/form.fxml"));
        controller = new Controller(model);
        loader.setController(controller);
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Test
    public void testDodaj() {
        int oldSize = controller.getModel().getKorisnici().size();
        clickOn("#dodaj");
        int newSize = controller.getModel().getKorisnici().size();
        assertEquals(oldSize + 1, newSize);
    }
}