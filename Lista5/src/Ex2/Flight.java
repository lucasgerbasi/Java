package Ex2;

import java.util.ArrayList;

public class Flight {
    private Number id;
    private String origin;
    private String destination;
    private ArrayList<Reservation> reservations;

    public Flight() {
    }

    public Flight(Number id, String origin, String destination) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        reservations = new ArrayList<>();
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }


}
