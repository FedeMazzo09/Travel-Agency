import java.time.LocalDate;

public class Romantico extends Pacchetto {
    private LocalDate dataFesteggiamento;

    public Romantico(int numeroPersone, String descrizione, double prezzo, LocalDate dataInizio, LocalDate dataFine, LocalDate dataFesteggiamento) {
        super(numeroPersone, descrizione, prezzo, dataInizio, dataFine);
        this.dataFesteggiamento = dataFesteggiamento;
    }

    public double costoBase() {
        double costo = super.costoBase();
        if (!dataFesteggiamento.isBefore(getDataInizio()) && !dataFesteggiamento.isAfter(getDataFine())) {
            costo = costo * 0.5;
        }
        return costo;
    }
}