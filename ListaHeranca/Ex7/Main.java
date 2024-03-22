package ListaHeranca.Ex7;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(1000.0); // Criando uma nova conta com saldo inicial de 1000.0
        Cartao meuCartao = new Cartao(minhaConta, "1234"); // Criando um novo cartão associado a essa conta e usando "1234" como senha

        // Testando retirada e verificação de saldo
        meuCartao.retirada(500.0, "1234"); // Retirada de 500.0 com senha correta
        System.out.println("Saldo atual: " + meuCartao.saldo("1234")); // Verificando saldo com senha correta

        // Testando alteração de senha
        meuCartao.alterarSenha("1234", "5678"); // Alterando a senha de "1234" para "5678"

        // Testando retirada e verificação de saldo após alteração de senha
        meuCartao.retirada(200.0, "5678"); // Retirada de 200.0 com nova senha
        System.out.println("Saldo atual: " + meuCartao.saldo("5678")); // Verificando saldo com nova senha
    }
}