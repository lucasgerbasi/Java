//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro obj1 = new Carro("Fiat", "Palio", "branca", 2018, false, 0);

        Carro obj2 = new Carro("GM", "Onix", "cinza", 2020, false, 0);

        obj1.mostra();
        obj2.mostra();

        obj1.ligar();
        obj1.acelerar(20);
        obj1.frear(10);

        obj1.mostra();
    }
}