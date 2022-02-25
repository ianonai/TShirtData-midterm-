package sheridan.franciia.tshirtdata.domain;

import java.io.Serializable;

public class Envelope implements Serializable {

    private String name = "";
    private int color = 1;
    private int size = 2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
