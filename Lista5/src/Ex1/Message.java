package Ex1;

import java.util.ArrayList;

public class Message {
    private int id;
    private String text;

    public Message() {
    }

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Ex1.Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
