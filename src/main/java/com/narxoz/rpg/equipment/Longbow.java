package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {
    private final int damage=30;
    private final String weaponType="Bow";
    private final String range="Long";

    @Override public int getDamage() { return damage; }
    @Override public String getWeaponType() { return weaponType; }
    public String getRange() { return range; }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranger)-Long range bow (Range: " +range+ ")";
    }
}
