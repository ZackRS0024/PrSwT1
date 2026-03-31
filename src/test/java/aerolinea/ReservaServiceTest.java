package aerolinea;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ReservaServiceTest {

    @Test
    public void testCodigoValido() {
        assertTrue(ReservaService.validarCodigoReserva("XYZ999"), "codigo valido");
        assertFalse(ReservaService.validarCodigoReserva("abc123"), "codigo invalido");
    }

    @Test
    public void testValidarNombre() {
        assertTrue(ReservaService.validarNombre("Carlos"));
        assertFalse(ReservaService.validarNombre("Ana"));
    }

}