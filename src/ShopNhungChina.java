import java.time.LocalDate;

public class ShopNhungChina {
    private String id;
    private String name;
    private String cost;
    private LocalDate manufacturingDate;

    public ShopNhungChina() {
    }

    public ShopNhungChina(String id, String name, String cost, LocalDate manufacturingDate) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.manufacturingDate = manufacturingDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }
}


