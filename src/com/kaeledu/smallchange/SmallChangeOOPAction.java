package com.kaeledu.smallchange;

public enum SmallChangeOOPAction {
    INCOME("+"),
    CONSUMPTION("-");

    private final String description;

    private SmallChangeOOPAction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
