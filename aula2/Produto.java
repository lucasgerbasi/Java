public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    public Produto() {}

    public Produto(int id, int qtde, String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x) {
        qtde += x;
    }

    public void vender(int x) {
        qtde -= x;
    }

    public void subir(float x) {
        preco += x;
    }

    public void descer(float x) {
        preco -= x;
    }

    public void mostra() {
        System.out.println("ID: " + id + " Qtde: " + qtde + " Descrição: "+ descricao + " Preço: " + preco);
    }
}
