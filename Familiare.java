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
}
