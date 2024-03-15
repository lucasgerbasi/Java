package Lista4;

public class Funcionario {
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected Number salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String cpf, Number salario) {
        setNome(nome);
        setEndereco(endereco);
        setCpf(cpf);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Number getSalario() {
        return salario;
    }

    public void setSalario(Number salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Number calculaSalario() {
        return this.salario;
    }
}
