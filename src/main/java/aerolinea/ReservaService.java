package aerolinea;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReservaService {

    public static boolean validarCodigoReserva(String codigo) {
        String patron = "^[A-Z]{3}[0-9]{3}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(codigo);

        if (matcher.matches()) {
            System.out.println("codigo valido");
            return true;
        } else {
            System.out.println("Ingrese un código de reserva válido");
            return false;
        }
    }

    public static boolean validarNombre(String nombre) {
        String patron = "^[a-zA-Z]{5,}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(nombre.trim());

        if (matcher.matches()) {
            System.out.println("nombre válido");
            return true;
        } else {
            System.out.println("El nombre del pasajero debe tener al menos cinco caracteres alfabéticos");
            return false;
        }
    }

    public static boolean validarPasaporte(String pasaporte) {
        String patron = "^[a-zA-Z0-9]{8,10}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(pasaporte);

        if (matcher.matches()) {
            System.out.println("pasaporte válido");
            return true;
        } else {
            System.out.println("Ingrese un número de pasaporte válido");
            return false;
        }
    }

    public static boolean validarCantidadAsientos(int cantidad) {

        if (cantidad > 0) {
            System.out.println("cantidad de asientos válida");
            return true;
        } else {
            System.out.println("La cantidad de asientos debe ser mayor a cero");
            return false;
        }
    }

    public static boolean validarFechaVuelo(LocalDate fechaVuelo) {

        LocalDate hoy = LocalDate.now();

        if (fechaVuelo.isAfter(hoy)) {
            System.out.println("fecha válida");
            return true;
        } else {
            System.out.println("La fecha del vuelo debe ser posterior a la fecha actual");
            return false;
        }
    }

    public static boolean registrarReserva(String codigo, String nombre, String pasaporte,
                                           int cantidadAsientos, LocalDate fechaVuelo) {

        boolean codigoValido = validarCodigoReserva(codigo);
        boolean nombreValido = validarNombre(nombre);
        boolean pasaporteValido = validarPasaporte(pasaporte);
        boolean asientosValidos = validarCantidadAsientos(cantidadAsientos);
        boolean fechaValida = validarFechaVuelo(fechaVuelo);

        if (codigoValido && nombreValido && pasaporteValido && asientosValidos && fechaValida) {
            System.out.println("La reserva ha sido registrada correctamente");
            return true;
        } else {
            System.out.println("Debe ingresar todos los datos requeridos");
            return false;
        }
    }
}
