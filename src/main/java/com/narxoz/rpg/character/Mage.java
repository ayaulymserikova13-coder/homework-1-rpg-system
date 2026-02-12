package com.narxoz.rpg.character;

public class Mage extends AbstractCharacter {

    public Mage(String name) {
        super(name, 70, 150, 20, 90);
    }

    @Override
    public String getCharacterClass() {
        return "Mage";
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " casts ARCANE BLAST! A burst of magic damage!");
    }
}
