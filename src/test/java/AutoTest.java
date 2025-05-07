import org.junit.jupiter.api.Test;
import org.transporte.domain.model.Auto;

import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

    @Test
    public void transportarTest() {
        Auto auto = new Auto();
        String descripcion = auto.transportar("Buenos Aires", "La Plata");

        assertEquals("[Auto] Transportando desde Buenos Aires hacia La Plata por carretera.", descripcion);
    }

}
