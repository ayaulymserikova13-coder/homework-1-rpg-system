package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {
    private final int damage=15;
    private final String weaponType="Staff";
    private final int manaBoost=20;

    @Override public int getDamage() { return damage; }
    @Override public String getWeaponType() { return weaponType; }
    public int getManaBoost() { return manaBoost; }
    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic)-Channeling focus (+Mana " +manaBoost+ ")";
    }
}

