package Ex1;

public class Main {
    public static void main(String[] args) {
        Message mensagem1 = new Message(1, "Olá");
        Message mensagem2 = new Message(2, "Como você está?");
        Message mensagem3 = new Message(3, "Estou bem");

        Forum forum = new Forum(1, "Discussão Geral", "http://exemplo.com");

        forum.addMessage(mensagem1);
        forum.addMessage(mensagem2);
        forum.addMessage(mensagem3);

        System.out.println("Detalhes do fórum:");
        System.out.println(forum);

        System.out.println("Mensagens no fórum:");
        for (Message mensagem : forum.getMessages()) {
            System.out.println(mensagem);
        }
    }
}
