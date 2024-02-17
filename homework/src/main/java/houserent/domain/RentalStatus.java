package houserent.domain;

public enum RentalStatus {
    Rented("已出租"),
    Available("未出租");

    private final String description;

    private RentalStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
