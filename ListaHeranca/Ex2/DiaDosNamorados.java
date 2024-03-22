package ListaHeranca.Ex2;

public abstract class DiaDosNamorados {
    private String destinatario;

    public DiaDosNamorados() {
    }

    public DiaDosNamorados(String destinatario) {
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
        System.out.println("Feliz dia dos namorados.");
    }
}
