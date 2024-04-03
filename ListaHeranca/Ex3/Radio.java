package ListaHeranca.Ex3;

public class Radio extends Produto {
    private String estacao;
    private String banda;

    public Radio(int numeroSerial, int volume) {
        super(numeroSerial, volume);
    }

    public String escutar() {
        return estacao + " " + banda;
    }

    public void trocaEstacao(String estacao) {
        this.estacao = estacao;
    }

    public void trocaBanda(String banda) {
        this.banda = banda;
    }

    public String toString() {
        return super.toString() + "\nEstacao: " + estacao + "\nBanda: " + banda;
    }
}

