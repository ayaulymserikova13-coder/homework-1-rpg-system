package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface Character {
    String getName();
    String getCharacterClass();

    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();

    Weapon getWeapon();
    Armor getArmor();

    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);

    void displayStats();
    void displayEquipment();
    void useSpecialAbility();
}

