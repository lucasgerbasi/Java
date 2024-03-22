package ListaHeranca.Ex2;

public abstract class Natal {
    private String destinatario;

    public Natal() {
    }

    public Natal(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void showMessage() {
        System.out.println("Para: " + destinatario);
        System.out.println("Feliz natal.");
    }
}
