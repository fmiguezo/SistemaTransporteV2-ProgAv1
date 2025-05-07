import org.junit.jupiter.api.Test;
import org.transporte.application.dto.ViajeDTO;
import org.transporte.application.services.TransporteServiceImpl;
import org.transporte.domain.exceptions.TransporteInvalidoException;

import static org.junit.jupiter.api.Assertions.*;

public class TransporteServiceImplTest {
    TransporteServiceImpl service = new TransporteServiceImpl();

    @Test
    // Debería devolver un viaje con auto
    void realizarViajeConAuto() throws TransporteInvalidoException {
        ViajeDTO viaje = service.realizarViaje("auto", "A", "B");

        assertNotNull(viaje);
        assertEquals("A", viaje.getOrigen());
        assertEquals("B", viaje.getDestino());
        assertEquals("auto", viaje.getTipoTransporte().toLowerCase());
    }

    @Test
    // Debería devolver un viaje con dron
    void realizarViajeConDron() throws TransporteInvalidoException {
        ViajeDTO viaje = service.realizarViaje("dron", "X", "Y");

        assertNotNull(viaje);
        assertEquals("X", viaje.getOrigen());
        assertEquals("Y", viaje.getDestino());
        assertEquals("dron", viaje.getTipoTransporte().toLowerCase());
    }

    @Test
    // Debería lanzar una excepción si el tipo de transporte es inválido
    void realizarViajeConTransporteInvalido() {
        assertThrows(TransporteInvalidoException.class, () ->
                service.realizarViaje("bicicleta", "Casa", "Trabajo")
        );
    }
}
