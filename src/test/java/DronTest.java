import org.junit.jupiter.api.Test;
import org.transporte.domain.model.Dron;

import static org.junit.jupiter.api.Assertions.*;

public class DronTest {

    @Test
    public void transportarTest() {
        Dron dron = new Dron();
        String descripcion = dron.transportar("Córdoba", "Rosario");

        assertEquals("[Dron] Volando de Córdoba a Rosario.", descripcion);
    }
}