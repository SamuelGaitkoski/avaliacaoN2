package br.com.samuelgaitkoski.rickandmorty_api.model.dto;

import br.com.samuelgaitkoski.rickandmorty_api.model.Gender;
import br.com.samuelgaitkoski.rickandmorty_api.model.Status;

public class CharacterDTO {
    
    private int id;
    private String name;
    private Status status;
    private String species;
    private String type;
    private Gender gender;

    public CharacterDTO(int id, String name, Status status, String species, String type, Gender gender) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
    }

    public CharacterDTO() {
        
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
