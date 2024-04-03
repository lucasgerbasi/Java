package ListaHeranca.Ex5e6;

public class Conta {
    private String nomeCliente;
    private double salarioMensal;
    private int numeroConta;
    private double saldo;
    double limite;

    public Conta(String nomeCliente, double salarioMensal, int numeroConta, double saldo, double limite) {
        this.nomeCliente = nomeCliente;
        this.salarioMensal = salarioMensal;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        if (limite <= salarioMensal) {
            this.limite = limite;
        } else {
            this.limite = salarioMensal;
            System.out.println("O limite não pode ser maior que o salário mensal. O limite foi ajustado para o valor do salário.");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public boolean retira(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Retirada de R$" + valor + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar a retirada de R$" + valor);
            return false;
        }
    }

    public double saldo() {
        return saldo;
    }
}
