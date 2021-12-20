package br.com.samuelgaitkoski.rickandmorty_api.util;

import br.com.samuelgaitkoski.rickandmorty_api.model.Episode;
import br.com.samuelgaitkoski.rickandmorty_api.model.dto.EpisodeDTO;

public class EpisodeMapping {
    
    private EpisodeMapping() {

    }

    public static EpisodeDTO fromEpisode(Episode episode) {
        return new EpisodeDTO(episode.getId(), episode.getName(), episode.getAir_date(), episode.getEpisode());
    }

    public static Episode toEpisode(EpisodeDTO dto) {
        return new Episode(dto.getId(), dto.getName(), dto.getAir_date(), dto.getEpisode());
    }
}
