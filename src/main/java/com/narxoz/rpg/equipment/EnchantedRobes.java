package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {
    private final int defense=10;
    private final String armorType="Robes";
    private final int manaBoost=25;

    @Override public int getDefense() { return defense; }
    @Override public String getArmorType() { return armorType; }
    public int getManaBoost() { return manaBoost; }
    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic)-Light robes infused with mana (+Mana " +manaBoost+ ")";
    }
}

