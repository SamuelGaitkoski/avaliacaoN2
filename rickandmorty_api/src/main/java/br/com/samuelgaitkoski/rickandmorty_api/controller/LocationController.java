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

import br.com.samuelgaitkoski.rickandmorty_api.model.dto.LocationDTO;
import br.com.samuelgaitkoski.rickandmorty_api.service.LocationService;

@RestController
@RequestMapping("/localizacao") 
public class LocationController {
    
    @Autowired
    private LocationService locationService;

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
    public ResponseEntity<List<LocationDTO>> findAll() {

        try {
            var listOfLocations = locationService.findAll();
            return new ResponseEntity<>(listOfLocations, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocationDTO> findById(@PathVariable int id) {

        try {
            var result = locationService.findById(id);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<LocationDTO> findByName(@PathVariable String name) {

        try {
            var result = locationService.findByName(name);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<LocationDTO>> findByType(@PathVariable String type) {

        try {
            var result = locationService.findByType(type);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
