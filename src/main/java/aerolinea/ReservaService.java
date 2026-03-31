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


}
