package br.com.samuelgaitkoski.rickandmorty_api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.samuelgaitkoski.rickandmorty_api.model.dto.EpisodeDTO;
import br.com.samuelgaitkoski.rickandmorty_api.repository.EpisodeRepository;
import br.com.samuelgaitkoski.rickandmorty_api.util.EpisodeMapping;

public class EpisodeService {
    
    @Autowired
    private EpisodeRepository episodeRepository; 

    public EpisodeDTO insertOrUpdate(EpisodeDTO episode) { 
        var result = episodeRepository.save(EpisodeMapping.toEpisode(episode)); 
        return EpisodeMapping.fromEpisode(result);
    }

    public List<EpisodeDTO> findAll() {
        return episodeRepository.findAll().stream().map(episode -> EpisodeMapping.fromEpisode(episode)).
        collect(Collectors.toList());
    }

    public EpisodeDTO findById(int id) {
        var result = episodeRepository.findById(id);

        if(result.isPresent()) {
            return EpisodeMapping.fromEpisode(result.get());
        } 
        else {
            return new EpisodeDTO(); 
        }
    }

    public EpisodeDTO findByName(String name) {
        var result = episodeRepository.findByName(name);

        if(result.isPresent()) {
            return EpisodeMapping.fromEpisode(result.get());
        }
        return new EpisodeDTO();
    }

    public EpisodeDTO findByEpisode(String episode) {
        var result = episodeRepository.findByEpisode(episode);

        if(result.isPresent()) {
            return EpisodeMapping.fromEpisode(result.get());
        }
        return new EpisodeDTO();
    }

}
