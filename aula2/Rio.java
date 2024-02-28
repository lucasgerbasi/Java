public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio() {}

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x) {
        nivel += x;
    }

    public void ensolarar(float x) {
        nivel -= x;
    }

    public void limpar() {
        poluido = false;
    }

    public void sujar() {
        poluido = true;
    }

    public void mostra() {
        System.out.println("Nome: " + nome + " Nível: " + nivel + " Poluído: " + poluido);
    }
}
