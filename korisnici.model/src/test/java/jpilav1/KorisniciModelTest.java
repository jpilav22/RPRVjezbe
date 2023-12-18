package jpilav1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KorisniciModelTest {
    @Test
    public void testNapuni() {
        KorisniciModel model = new KorisniciModel();
        model.napuni("ExampleName", "ExampleSurname", "example@email.com", "Example1111", "ExamplePassword");
        assertFalse(model.getKorisnici().isEmpty());
    }
}