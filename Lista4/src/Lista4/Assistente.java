package Lista4;


public class Assistente {
    private Number horaExtra;
    protected String nome;
    protected String endereco;
    protected String cpf;
    protected Number salario;

    public Assistente() {
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

    public Number getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Number horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                "horaExtra=" + horaExtra +
                '}';
    }

    public void calculaSalario() {
        System.out.println("Salário: " + this.salario + " + Horas Extras: " + this.horaExtra);
    }
}
