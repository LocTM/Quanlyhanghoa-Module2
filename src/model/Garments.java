package model;

import java.time.LocalDate;

public class Garments extends ShopNhungChina {
    private String type;


    public Garments() {
    }

    public Garments(String type) {
        this.type = type;
    }

    public Garments(String id, String name, String cost, LocalDate manufacturingDate, String type) {
        super(id, name, cost, manufacturingDate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Garments{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }


}
