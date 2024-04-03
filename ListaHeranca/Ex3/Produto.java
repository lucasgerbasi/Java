package ListaHeranca.Ex3;

import java.util.Random;

class Produto {
    private int numeroSerial;
    private int volume;
    private String teste = "nao testado";

    public Produto(int numeroSerial, int volume) {
        this.numeroSerial = numeroSerial;
        this.volume = volume;
    }

    public boolean testaUnidade() {
        if (teste.equals("nao testado")) {
            double chance = Math.random();
            if (chance < 0.9) {
                teste = "aprovado";
                return true;
            } else {
                teste = "reprovado";
                return false;
            }
        }
        return false;
    }

    public void setaVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Numero Serial: " + numeroSerial + "\nVolume: " + volume + "\nTeste: " + teste;
    }
}
