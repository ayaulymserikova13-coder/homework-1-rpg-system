package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Mage;

public class MageFactory extends CharacterFactory {
    protected Character createCharacter(String name) {
        return new Mage(name);
    }
}
