package com.narxoz.rpg.character;

public class Warrior extends AbstractCharacter {
    public Warrior(String name) {
        super(name, 150, 30, 80, 20);
    }

    @Override
    public String getCharacterClass() {
        return "Warrior";
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName()+" uses BERSERKER RAGE! Strength temporarily increased!");
    }
}
