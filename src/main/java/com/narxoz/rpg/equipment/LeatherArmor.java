package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    private final int defense=20;
    private final String armorType="Leather";
    private final int agilityBonus=10;

    @Override public int getDefense() { return defense; }
    @Override public String getArmorType() { return armorType; }
    public int getAgilityBonus() { return agilityBonus; }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) -Flexible armor (+Agility " +agilityBonus+ ")";
    }
}
