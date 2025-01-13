package enums;

public enum itemType {
    CONSUMABLE("Consumable"),
    NON_CONSUMABLE("Non-Consumable");

    private final String displayName;

    itemType(String displayName) { this.displayName = displayName; }
    public String getDisplayName() { return displayName; }
}
