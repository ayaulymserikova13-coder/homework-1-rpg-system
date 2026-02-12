package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public abstract class AbstractCharacter implements Character {

    private final String name;
    private final int health;
    private final int mana;
    private final int strength;
    private final int intelligence;

    private Weapon weapon;
    private Armor armor;

    protected AbstractCharacter(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    @Override public String getName() { return name; }

    @Override public int getHealth() { return health; }
    @Override public int getMana() { return mana; }
    @Override public int getStrength() { return strength; }
    @Override public int getIntelligence() { return intelligence; }

    @Override public Weapon getWeapon() { return weapon; }
    @Override public Armor getArmor() { return armor; }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (" + getCharacterClass() + ") ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void displayEquipment() {
        System.out.println("--- Equipment ---");
        if (weapon == null) {
            System.out.println("Weapon: (none)");
        } else {
            System.out.println("Weapon: " + weapon.getWeaponInfo());
            System.out.println("  Type: " + weapon.getWeaponType());
            System.out.println("  Damage: " + weapon.getDamage());
        }

        if (armor == null) {
            System.out.println("Armor: (none)");
        } else {
            System.out.println("Armor: " + armor.getArmorInfo());
            System.out.println("  Type: " + armor.getArmorType());
            System.out.println("  Defense: " + armor.getDefense());
        }
    }
}
