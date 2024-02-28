public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, 10, "Produto 1", 20.0f);

        Produto produto2 = new Produto(2, 5, "Produto 2", 15.0f);

        Produto produto3 = new Produto();

        // Test the methods
        produto1.comprar(3);
        produto1.subir(5.0f);
        produto1.mostra();

        produto2.vender(2);
        produto2.descer(3.0f);
        produto2.mostra();
    }
}
