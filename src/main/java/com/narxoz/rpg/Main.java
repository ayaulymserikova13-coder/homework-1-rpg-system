package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("  RPG Character & Equipment System  \n");
        Map<String, CharacterFactory> characterFactories=Map.of(
                "warrior", new WarriorFactory(),
                "mage", new MageFactory(),
                "archer", new ArcherFactory()
        );

        Map<String, EquipmentFactory> equipmentFactories=Map.of(
                "medieval", new MedievalEquipmentFactory(),
                "magic", new MagicEquipmentFactory(),
                "ranger", new RangerEquipmentFactory()
        );

        System.out.println("  Creating Characters  ");
        Character thor=characterFactories.get("warrior").create("Thor");
        Character gandalf=characterFactories.get("mage").create("Gandalf");
        Character legolas=characterFactories.get("archer").create("Legolas");

        displayCharacter(thor);
        displayCharacter(gandalf);
        displayCharacter(legolas);

        System.out.println("\n  Equipping Characters  ");
        equipCharacter(thor, equipmentFactories.get("medieval"));
        equipCharacter(gandalf, equipmentFactories.get("magic"));
        equipCharacter(legolas, equipmentFactories.get("ranger"));

        System.out.println("\n  Final Character Sheets  ");
        displayFull(thor);
        displayFull(gandalf);
        displayFull(legolas);

        System.out.println("\n  Demo Complete  ");
    }

    private static void displayCharacter(Character c) {
        c.displayStats();
        System.out.print("Special Ability: ");
        c.useSpecialAbility();
        System.out.println();
    }

    private static void equipCharacter(Character c, EquipmentFactory factory) {
        System.out.println("Equipping "+c.getName()+" with "+factory.getThemeName()+" set...");
        c.equipWeapon(factory.createWeapon());
        c.equipArmor(factory.createArmor());
    }

    private static void displayFull(Character c) {
        c.displayStats();
        c.displayEquipment();
        System.out.print("Special Ability: ");
        c.useSpecialAbility();
        System.out.println();
    }
}
