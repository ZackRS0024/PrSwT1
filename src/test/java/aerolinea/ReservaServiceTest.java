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

    @Test
    public void testValidarPasaporte() {
        assertTrue(ReservaService.validarPasaporte("A1234567"));
        assertFalse(ReservaService.validarPasaporte("1234567"));

    }

    @Test
    public void testValidarCantidadAsientos() {
        assertTrue(ReservaService.validarCantidadAsientos(1));
        assertFalse(ReservaService.validarCantidadAsientos(0));
    }

    @Test
    public void testValidarFechaVuelo() {
        assertTrue(ReservaService.validarFechaVuelo(LocalDate.now().plusDays(1)));
        assertFalse(ReservaService.validarFechaVuelo(LocalDate.now()));           // hoy
    }
}