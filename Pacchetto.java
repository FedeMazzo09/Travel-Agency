import java.util.Calendar;

public class Pacchetto {
    private int numeroPersone;
    private String descrizione;
    private double prezzoPersona;
    private Calendar dataInizio;
    private Calendar dataFine;
    enum TipoPacchetto {
        FAMILIARE,
        ROMANTICO,
        LAVORO
    }

    public Pacchetto(int numeroPersone, String descrizione, double prezzoPersona, Calendar dataInizio, Calendar dataFine, TipoPacchetto tipo) {
        this.numeroPersone = numeroPersone;
        this.descrizione = descrizione;
        this.prezzoPersona = prezzoPersona;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public int getNumeroPersone() {
        return numeroPersone;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzoPersona() {
        return prezzoPersona;
    }

    public Calendar getDataInizio() {
        return dataInizio;
    }

    public Calendar getDataFine() {
        return dataFine;
    }

    public double costoBase(){
        return numeroPersone * prezzoPersona;
    }
}