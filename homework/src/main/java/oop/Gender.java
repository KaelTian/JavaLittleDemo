package oop;

public enum Gender {
    MALE("男性"),
    FEMALE("女性");

    private final String description;

    private Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
