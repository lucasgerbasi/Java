package Lista4;

public class Gerente extends Funcionario{
    private Number bonus;
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected Number salario;

    public Gerente() {
    }

    public Gerente(String nome, String endereco, String cpf, Number salario, Number bonus, String nome1, String endereco1, String cpf1, Number salario1) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
        this.nome = nome1;
        this.endereco = endereco1;
        this.cpf = cpf1;
        this.salario = salario1;
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

    public Number getBonus() {
        return bonus;
    }

    public void setBonus(Number bonus) {
        this.bonus = bonus;
    }

    public void calculaSalario() {
        System.out.println("Salário: " + this.salario + bonus);
    }
}
