package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {
    public final Character create(String name) {
        return createCharacter(name);
    }

    protected abstract Character createCharacter(String name);
}
