package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    private final int defense=30;
    private final String armorType="Heavy Plate";

    @Override public int getDefense() { return defense; }
    @Override public String getArmorType() { return armorType; }
    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval)-Heavy armor with excellent protection";
    }
}
