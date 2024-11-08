package enums;

public enum ammo {

    //I used AI for this in order to optimize the time

    // Handgun Calibers
    NINE_MM("9mm"),
    FORTY_S_W("40 S&W"),
    FORTY_FIVE_ACP("45 ACP"),
    THREE_EIGHTY_AUTO("380 Auto"),
    THREE_FIFTY_SEVEN_MAGNUM("357 Magnum"),
    TEN_MM("10mm"),
    FORTY_FOUR_MAGNUM("44 Magnum"),

    // Rifle Calibers
    FIVE_FIVE_SIX_NATO("5.56 NATO"),
    TWO_TWO_THREE_REM("223 Remington"),
    SEVEN_SIX_TWO_NATO("7.62 NATO"),
    THREE_OH_EIGHT_WIN("308 Winchester"),
    THREE_HUNDRED_BLACKOUT("300 Blackout"),
    THIRTY_THIRTY_WIN("30-30 Winchester"),
    THREE_OH_EIGHT_LAPUA("338 Lapua Magnum"),

    // Shotgun Calibers
    TWELVE_GAUGE("12 Gauge"),
    TWENTY_GAUGE("20 Gauge"),
    FOURTEN_GAUGE("410 Gauge"),

    // Special Calibers for Non-Lethal and Specialized Munitions
    TASER_CARTRIDGE("Taser Cartridge"),
    FORTY_MM("40mm"),
    FORTY_MM_SMOKE("40mm Smoke Canister"),
    FLASHBANG("Flashbang"),
    RUBBER_BALL_GRENADE("Rubber Ball Grenade"),
    BEAN_BAG("Bean Bag Round"),
    PEPPER_BALL("Pepper Ball"),
    SPECIAL("Special");

    private final String displayName;

    ammo(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}