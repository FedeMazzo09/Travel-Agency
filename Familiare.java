import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Familiare extends Pacchetto {
    private int numeroMinori;

    public Familiare(int numeroPersone, String descrizione, double prezzo, LocalDate dataInizio, LocalDate dataFine, int numeroMinori) {
        super(numeroPersone, descrizione, prezzo, dataInizio, dataFine);
        this.numeroMinori = numeroMinori;
    }

    public double costoBase() {
        double costo = super.costoBase();
        int giorni = (int) ChronoUnit.DAYS.between(getDataInizio(), getDataFine()) + 1;
        if (numeroMinori == 1) {
            costo = costo - (25 * giorni);
        } else if (numeroMinori > 1) {
            costo = costo - (35 * numeroMinori * giorni);
        }
        return costo;
    }
}
