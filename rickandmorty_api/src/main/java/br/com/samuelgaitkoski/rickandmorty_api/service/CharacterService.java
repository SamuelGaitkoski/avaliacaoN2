package br.com.samuelgaitkoski.rickandmorty_api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuelgaitkoski.rickandmorty_api.model.dto.CharacterDTO;
import br.com.samuelgaitkoski.rickandmorty_api.repository.CharacterRepository;
import br.com.samuelgaitkoski.rickandmorty_api.util.CharacterMapping;

@Service
public class CharacterService {
    
    @Autowired
    private CharacterRepository characterRepository; 

    public CharacterDTO insertOrUpdate(CharacterDTO character) { 
        var result = characterRepository.save(CharacterMapping.toCharacter(character)); 
        return CharacterMapping.fromCharacter(result);
    }

    public List<CharacterDTO> findAll() {
        return characterRepository.findAll().stream().map(character -> CharacterMapping.fromCharacter(character)).
        collect(Collectors.toList());
    }

    public CharacterDTO findById(int id) {
        var result = characterRepository.findById(id);

        if(result.isPresent()) {
            return CharacterMapping.fromCharacter(result.get());
        } 
        else {
            return new CharacterDTO(); 
        }
    }

    public CharacterDTO findByName(String name) {
        var result = characterRepository.findByName(name);

        if(result.isPresent()) {
            return CharacterMapping.fromCharacter(result.get());
        }
        return new CharacterDTO();
    }

    public List<CharacterDTO> findByStatus(String status) {
        return characterRepository.findByStatus(status).stream().map(character -> CharacterMapping.
        fromCharacter(character)).collect(Collectors.toList());
    }

}
