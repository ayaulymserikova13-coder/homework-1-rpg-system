package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {
    private final int damage=25;
    private final String weaponType="Sword";

    @Override public int getDamage() { return damage; }
    @Override public String getWeaponType() { return weaponType; }

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Medieval)-A sturdy blade forged from iron";
    }
}
