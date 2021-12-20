package br.com.samuelgaitkoski.rickandmorty_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samuelgaitkoski.rickandmorty_api.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

    public Optional<Location> findByName(String name);
    public List<Location> findByType(String type);
}
