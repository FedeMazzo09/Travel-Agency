import java.util.Calendar;

public class Romantico extends Pacchetto {
    private Calendar dataFesteggiamento;

    public Romantico(int numeroPersone, String descrizione, double prezzo, Calendar dataInizio, Calendar dataFine, Calendar dataFesteggiamento) {
        super(numeroPersone, descrizione, prezzo, dataInizio, dataFine);
        this.dataFesteggiamento = dataFesteggiamento;
    }

    public Calendar getDataFesteggiamento() {
        return dataFesteggiamento;
    }

    public double costoBase() {
        double costo = super.costoBase();
        if (!dataFesteggiamento.before(getDataInizio()) && !dataFesteggiamento.after(getDataFine())) {
            costo *= 0.5;
        }
        return costo;
    }
}