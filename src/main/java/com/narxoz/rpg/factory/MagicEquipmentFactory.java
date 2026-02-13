package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.*;

public class MagicEquipmentFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new WizardStaff(); }
    public Armor createArmor() { return new EnchantedRobes(); }
    public String getThemeName() { return "Magic"; }
}
