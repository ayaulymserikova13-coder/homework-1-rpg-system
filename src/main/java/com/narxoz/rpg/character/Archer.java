package com.narxoz.rpg.character;

public class Archer extends AbstractCharacter {
    public Archer(String name) {
        super(name, 110, 60, 55, 50);
    }

    @Override
    public String getCharacterClass() {
        return "Archer";
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName()+" uses MULTI-SHOT! Fires multiple arrows at once!");
    }
}
