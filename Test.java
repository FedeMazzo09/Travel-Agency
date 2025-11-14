import java.time.LocalDate;
import java.util.Calendar;

public class Test {
    public static void main() {
        RegistroPacchetti registro = new RegistroPacchetti(10);

        Pacchetto p1 = new Familiare(2, "Vacanza al mare", 500, LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 7), 1);
        Pacchetto p2 = new Romantico(2, "Weekend romantico", 300, LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 7), LocalDate.of(2024, 6, 2));
        Pacchetto p3 = new Lavoro(1, "Viaggio di lavoro", 700, LocalDate.of(2024, 7, 10), LocalDate.of(2024, 7, 15), 5);

        registro.aggiungiPacchetto(p1);
        registro.aggiungiPacchetto(p2);
        registro.aggiungiPacchetto(p3);

        System.out.println("Costo medio totale: " + registro.calcolaCostoMedioTotale());

        System.out.println(p1.toString());
    }
}
