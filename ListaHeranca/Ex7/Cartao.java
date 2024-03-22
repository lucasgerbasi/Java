package ListaHeranca.Ex7;

public class Cartao {
    private Conta conta;
    private String senha;

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public void retirada(double valor, String senha) {
        if (this.senha.equals(senha)) {
            conta.retirada(valor);
        } else {
            System.out.println("Senha incorreta");
        }
    }

    public double saldo(String senha) {
        if (this.senha.equals(senha)) {
            return conta.getSaldo();
        } else {
            System.out.println("Senha incorreta");
            return 0.0;
        }
    }

    public void alterarSenha(String senhaAntiga, String novaSenha) {
        if (this.senha.equals(senhaAntiga)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso");
        } else {
            System.out.println("Senha incorreta");
        }
    }
}