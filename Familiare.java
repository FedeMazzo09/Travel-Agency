import java.util.Calendar;

public class Familiare extends Pacchetto {
    private int numeroMinori;

    public Familiare(int numeroPersone, String descrizione, double prezzo, Calendar dataInizio, Calendar dataFine, int numeroMinori) {
        super(numeroPersone, descrizione, prezzo, dataInizio, dataFine);
        this.numeroMinori = numeroMinori;
    }

    public int getNumeroMinori() {
        return numeroMinori;
    }

    public double costoBase() {
        double costo = super.costoBase();
        int giorni = (int) ((getDataFine().getTimeInMillis() - getDataInizio().getTimeInMillis()) / (1000 * 60 * 60 * 24)) + 1;
        if (numeroMinori == 1) {
            costo = costo - (25 * giorni);
        } else if (numeroMinori > 1) {
            costo = costo - (35 * numeroMinori * giorni);
        }
        return costo;
    }
}
