package br.com.samuelgaitkoski.rickandmorty_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuelgaitkoski.rickandmorty_api.model.dto.CharacterDTO;
import br.com.samuelgaitkoski.rickandmorty_api.service.CharacterService;

@RestController
@RequestMapping("/personagem") 
public class CharacterController {
    
    @Autowired
    private CharacterService characterService;

    @PostMapping
    public ResponseEntity<String> insert() {
        return new ResponseEntity<>("Método não permitido!", HttpStatus.BAD_REQUEST);
    }

    @PutMapping
    public ResponseEntity<String> update() {
        return new ResponseEntity<>("Método não permitido!", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping
    public ResponseEntity<String> delete() {
        return new ResponseEntity<>("Método não permitido!", HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    public ResponseEntity<List<CharacterDTO>> findAll() {

        try {
            var listOfCharacters = characterService.findAll();
            return new ResponseEntity<>(listOfCharacters, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CharacterDTO> findById(@PathVariable int id) {

        try {
            var result = characterService.findById(id);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<CharacterDTO> findByName(@PathVariable String name) {

        try {
            var result = characterService.findByName(name);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<CharacterDTO>> findByStatus(@PathVariable String status) {

        try {
            var result = characterService.findByStatus(status);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
