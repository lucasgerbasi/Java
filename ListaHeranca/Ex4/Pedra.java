package ListaHeranca.Ex4;

public class Pedra extends Coisa{

    @Override
    public String quemSouEu() {
        return "Pedra";
    }

    @Override
    public void compara(Coisa c) {
        if (c.quemSouEu().equals("Papel")) {
            System.out.println("Perdeu");
        }
        else if (c.quemSouEu().equals("Pedra")) {
            System.out.println("Empate");
        }
        else if (c.quemSouEu().equals("Tesoura")) {
            System.out.println("Ganhou");
        }
        else {
            System.out.println("Impossível calcular");
        }
    }
}
