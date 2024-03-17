package Ex2;

import java.util.ArrayList;

public class Reservation {
    private Number id;
    private Number date;

    public Reservation() {
    }

    public Reservation(Number id, Number date) {
        this.id = id;
        this.date = date;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Number getDate() {
        return date;
    }

    public void setDate(Number date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
