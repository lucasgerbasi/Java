package ListaHeranca.Ex3;

class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(12345, 50); // Exemplo de produto criado
        System.out.println("Antes do teste:");
        System.out.println(produto.toString());

        System.out.println("\nTestando o produto...");
        produto.testaUnidade();
        System.out.println("\nDepois do teste:");
        System.out.println(produto.toString());

        if (produto instanceof Radio) {
            Radio radio = (Radio) produto;
            radio.trocaEstacao("94.9");
            radio.trocaBanda("FM");
            System.out.println("\nDepois de configurar a estação e a banda:");
            System.out.println(radio.toString());
        } else if (produto instanceof TV) {
            TV tv = (TV) produto;
            tv.trocaCanal(5);
            System.out.println("\nDepois de configurar o canal:");
            System.out.println(tv.toString());
        }
    }
}

