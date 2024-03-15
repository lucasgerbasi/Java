package Lista4;

public class Diretor {
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected Number salario;
    private Number acoesEmpresa;

    public Diretor() {
    }

    public Diretor(String nome, String endereco, String cpf, Number salario, Number acoesEmpresa) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
        this.acoesEmpresa = acoesEmpresa;
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

    public Number getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(Number acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    public void calculaSalario() {
        System.out.println("Salário: " + this.salario + "Ações Empresa: " + this.acoesEmpresa);
    }
}
