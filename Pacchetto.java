import java.time.LocalDate;

public class Pacchetto {
    private int numeroPersone;
    private String descrizione;
    private double prezzoPersona;
    private LocalDate dataInizio;
    private LocalDate dataFine;

    public Pacchetto(int numeroPersone, String descrizione, double prezzoPersona, LocalDate dataInizio, LocalDate dataFine) {
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

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public double costoBase(){
        return numeroPersone * prezzoPersona;
    }

    public String toString() {
        return "Pacchetto{" +
                "numeroPersone=" + numeroPersone +
                ", descrizione='" + descrizione + '\'' +
                ", prezzoPersona=" + prezzoPersona +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                '}';
    }
}