package ListaHeranca.Ex4;

public class Papel extends Coisa {

    @Override
    public String quemSouEu() {
        return "Papel";
    }

    @Override
    public void compara(Coisa c) {
        if (c.quemSouEu().equals("Papel")) {
            System.out.println("Empate");
        }
        else if (c.quemSouEu().equals("Pedra")) {
            System.out.println("Ganhou");
        }
        else if (c.quemSouEu().equals("Tesoura")) {
            System.out.println("Perdeu");
        }
        else {
            System.out.println("Impossível calcular");
        }
    }
}
