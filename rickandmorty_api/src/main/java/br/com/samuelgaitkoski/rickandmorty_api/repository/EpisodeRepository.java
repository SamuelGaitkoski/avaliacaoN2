package br.com.samuelgaitkoski.rickandmorty_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samuelgaitkoski.rickandmorty_api.model.Episode;

public interface EpisodeRepository extends JpaRepository<Episode, Integer>{
    
    public Optional<Episode> findByName(String name);
    public Optional<Episode> findByEpisode(String episode);
}
