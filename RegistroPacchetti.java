public class RegistroPacchetti {
    private Pacchetto[] pacchetti;
    private int count;

    public RegistroPacchetti(int maxSize) {
        pacchetti = new Pacchetto[maxSize];
        count = 0;
    }

    public boolean aggiungiPacchetto(Pacchetto pacchetto) {
        if (count < pacchetti.length) {
            pacchetti[count] = pacchetto;
            count++;
            return true;
        }
        return false;
    }
// Calcola il costo medio totale di tutti i pacchetti nel registro
    public double calcolaCostoMedioTotale() {
        if (count == 0) {
            return 0;
        }
        double totale = 0;
        for (int i = 0; i < count; i++) {
            totale = totale + (pacchetti[i].costoBase());
        }
        return totale / count;
    }
}