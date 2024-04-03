package ListaHeranca.Ex4;

public class Tesoura extends Coisa{

    @Override
    public String quemSouEu() {
        return "Tesoura";
    }

    @Override
    public void compara(Coisa c) {
        if (c.quemSouEu().equals("Papel")) {
            System.out.println("Ganhou");
        }
        else if (c.quemSouEu().equals("Pedra")) {
            System.out.println("Perdeu");
        }
        else if (c.quemSouEu().equals("Tesoura")) {
            System.out.println("Empate");
        }
        else {
            System.out.println("Impossível calcular");
        }
    }
}
