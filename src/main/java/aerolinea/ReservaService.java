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

}
