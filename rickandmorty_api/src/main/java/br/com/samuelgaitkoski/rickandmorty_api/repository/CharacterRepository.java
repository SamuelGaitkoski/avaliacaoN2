package br.com.samuelgaitkoski.rickandmorty_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samuelgaitkoski.rickandmorty_api.model.Character;

public interface CharacterRepository extends JpaRepository<Character, Integer>{
    
    public Optional<Character> findByName(String name);
    public List<Character> findByStatus(String status);
}
