import java.util.Calendar;

public class Lavoro extends Pacchetto {
    private int numeroPasti;

    public Lavoro(int numeroPersone, String descrizione, double prezzo, Calendar dataInizio, Calendar dataFine, int numeroPasti) {
        super(numeroPersone, descrizione, prezzo, dataInizio, dataFine);
        this.numeroPasti = numeroPasti;
    }

    public int getNumeroPasti() {
        return numeroPasti;
    }
}
