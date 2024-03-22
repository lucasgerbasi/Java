package ListaHeranca.Ex2;

public class Aniversario {
    private String destinatario;

    public Aniversario() {
    }

    public Aniversario(String destinatario) {
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
        System.out.println("Feliz aniversário.");
    }
}
