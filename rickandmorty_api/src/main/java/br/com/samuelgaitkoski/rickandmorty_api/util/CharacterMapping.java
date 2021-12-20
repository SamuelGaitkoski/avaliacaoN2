package br.com.samuelgaitkoski.rickandmorty_api.util;

import br.com.samuelgaitkoski.rickandmorty_api.model.Character;
import br.com.samuelgaitkoski.rickandmorty_api.model.dto.CharacterDTO;

public class CharacterMapping {
    
    private CharacterMapping() {

    }

    public static CharacterDTO fromCharacter(Character character) {
        return new CharacterDTO(character.getId(), character.getName(), character.getStatus(), 
        character.getSpecies(), character.getType(), character.getGender());
    }

    public static Character toCharacter(CharacterDTO dto) {
        return new Character(dto.getId(), dto.getName(), dto.getStatus(), dto.getSpecies(), dto.getType(),
        dto.getGender());
    }

}
