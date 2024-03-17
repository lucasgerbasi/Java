package Ex2;

public class Passenger {
    private Number id;
    private String name;
    private String cpf;

    public Passenger() {
    }

    public Passenger(Number id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
