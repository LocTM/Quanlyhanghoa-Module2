package model;

public class HouseholdGoods extends ShopNhungChina {
    private String manufactory;
    private String color;

    public HouseholdGoods() {
    }

    public HouseholdGoods(String manufactory, String color) {
        this.manufactory = manufactory;
        this.color = color;
    }

    public String getManufactory() {
        return manufactory;
    }

    public void setManufactory(String manufactory) {
        this.manufactory = manufactory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HouseholdGoods{" +
                "manufactory='" + manufactory + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
