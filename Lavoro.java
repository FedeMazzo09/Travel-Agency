import java.util.Calendar;

public class Lavoro extends Pacchetto {
    private int numeroPasti;

    public Lavoro(int numeroPersone, String descrizione, double prezzo, Calendar dataInizio, Calendar dataFine, int numeroPasti) {
        super(numeroPersone, descrizione, prezzo, dataInizio, dataFine, Pacchetto.TipoPacchetto.LAVORO);
        this.numeroPasti = numeroPasti;
    }

    public int getNumeroPasti() {
        return numeroPasti;
    }
// Override del metodo costoBase
    public double costoBase() {
        double costo = super.costoBase();
        double maggiorazione = 0.15 * numeroPasti;
        costo = costo + (costo * maggiorazione);
        return costo;
    }
}
