package br.com.samuelgaitkoski.rickandmorty_api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "episodes")
public class Episode {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(columnDefinition = "varchar(50) not null")
    private String name;
    @Column(columnDefinition = "varchar(70) not null")
    private String air_date;
    @Column(columnDefinition = "varchar(70) not null")
    private String episode;

    public Episode(int id, String name, String air_date, String episode) {
        this.id = id;
        this.name = name;
        this.air_date = air_date;
        this.episode = episode;
    }

    public Episode() {

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

    public String getAir_date() {
        return this.air_date;
    }

    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

}
