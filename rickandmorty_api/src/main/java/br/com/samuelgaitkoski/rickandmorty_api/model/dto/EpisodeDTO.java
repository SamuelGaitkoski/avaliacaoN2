package br.com.samuelgaitkoski.rickandmorty_api.model.dto;

public class EpisodeDTO {

    private int id;
    private String name;
    private String air_date;
    private String episode;

    
    public EpisodeDTO(int id, String name, String air_date, String episode) {
        this.id = id;
        this.name = name;
        this.air_date = air_date;
        this.episode = episode;
    }

    public EpisodeDTO() {

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
