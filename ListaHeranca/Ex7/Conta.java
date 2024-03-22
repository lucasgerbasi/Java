package ListaHeranca.Ex7;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirada(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retirada realizada com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a retirada");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}