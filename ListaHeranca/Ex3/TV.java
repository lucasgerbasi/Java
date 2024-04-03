package ListaHeranca.Ex3;

public class TV extends Produto {
    private int canal;

    public TV(int numeroSerial, int volume) {
        super(numeroSerial, volume);
    }

    public String assistir() {
        return "Canal " + canal;
    }

    public void trocaCanal(int canal) {
        this.canal = canal;
    }

    public String toString() {
        return super.toString() + "\nCanal: " + canal;
    }
}
