package Ex2;

public class Main {
    public static void main(String[] args) {
        // Criando alguns passageiros
        Passenger passageiro1 = new Passenger(1, "João Silva", "12345678941");
        Passenger passageiro2 = new Passenger(2, "Maria Souza", "12384549345");

        // Criando alguns voos
        Flight voo1 = new Flight(1, "ABC123", "Nova York");
        Flight voo2 = new Flight(2, "XYZ456", "Los Angeles");

        // Criando reservas
        Reservation reserva1 = new Reservation(1, 3);
        Reservation reserva2 = new Reservation(2, 4);
        Reservation reserva3 = new Reservation(3, 5);

        // Adicionando reservas aos voos
        voo1.addReservation(reserva1);
        voo1.addReservation(reserva2);
        voo2.addReservation(reserva3);

        // Exibindo detalhes dos voos com as reservas
        System.out.println("Detalhes do Voo 1:");
        System.out.println(voo1);
        System.out.println("Reservas para o Voo 1:");
        for (Reservation reserva : voo1.getReservations()) {
            System.out.println(reserva);
        }

        System.out.println("Detalhes do Voo 2:");
        System.out.println(voo2);
        System.out.println("Reservas para o Voo 2:");
        for (Reservation reserva : voo2.getReservations()) {
            System.out.println(reserva);
        }
    }
}

