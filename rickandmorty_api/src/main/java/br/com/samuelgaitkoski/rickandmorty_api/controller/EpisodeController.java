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

import br.com.samuelgaitkoski.rickandmorty_api.model.dto.EpisodeDTO;
import br.com.samuelgaitkoski.rickandmorty_api.service.EpisodeService;

@RestController
@RequestMapping("/episodio") 
public class EpisodeController {
    
    @Autowired
    private EpisodeService episodeService;

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
    public ResponseEntity<List<EpisodeDTO>> findAll() {

        try {
            var listOfEpisodes = episodeService.findAll();
            return new ResponseEntity<>(listOfEpisodes, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EpisodeDTO> findById(@PathVariable int id) {

        try {
            var result = episodeService.findById(id);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<EpisodeDTO> findByName(@PathVariable String name) {

        try {
            var result = episodeService.findByName(name);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/episode/{episode}")
    public ResponseEntity<EpisodeDTO> findByEpisode(@PathVariable String episode) {

        try {
            var result = episodeService.findByEpisode(episode);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
