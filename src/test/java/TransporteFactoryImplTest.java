import org.junit.jupiter.api.Test;
import org.transporte.application.factories.TransporteFactoryImpl;
import org.transporte.domain.model.Auto;
import org.transporte.domain.model.Dron;
import org.transporte.domain.model.Transporte;
import org.transporte.domain.exceptions.TransporteInvalidoException;

import static org.junit.jupiter.api.Assertions.*;

public class TransporteFactoryImplTest {

    @Test
    public void crearAutoTest() throws TransporteInvalidoException {
        TransporteFactoryImpl factory = new TransporteFactoryImpl();
        Transporte auto = factory.crear("auto");

        assertTrue(auto instanceof Auto);
    }

    @Test
    public void crearDronTest() throws TransporteInvalidoException {
        TransporteFactoryImpl factory = new TransporteFactoryImpl();
        Transporte dron = factory.crear("dron");

        assertTrue(dron instanceof Dron);
    }

    @Test
    public void crearTransporteInvalidoTest() {
        TransporteFactoryImpl factory = new TransporteFactoryImpl();

        TransporteInvalidoException ex = assertThrows(
                TransporteInvalidoException.class,
                () -> factory.crear("barco")
        );

        assertEquals("Tipo de transporte no soportado: barco", ex.getMessage());

    }
}