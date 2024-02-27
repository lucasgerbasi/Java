public class Cliente {
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente() {}

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(float x) {
        this.saldo += x;
    }

    public void sacar(float x) {
        if (this.saldo - x >= 0) {
            this.saldo -= x;
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nroConta: " + this.numeroConta + " NroAgencia: " + this.numeroAgencia + " Nome: " + this.nome + " Saldo: " + this.saldo + "}";
    }
}


