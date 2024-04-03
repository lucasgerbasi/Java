package ListaHeranca.Ex5e6;

public class ContaEspecial extends Conta {
    public ContaEspecial(String nomeCliente, double salarioMensal, int numeroConta, double saldo, double limite) {
        super(nomeCliente, salarioMensal, numeroConta, saldo, limite);
        double limiteMaximo = salarioMensal * 3;
        if (limite <= limiteMaximo) {
            this.limite = limite;
        } else {
            this.limite = limiteMaximo;
            System.out.println("O limite excede 3 vezes o salário mensal. O limite foi ajustado para 3 vezes o salário.");
        }
    }
}
