package br.com.samuelgaitkoski.rickandmorty_api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.samuelgaitkoski.rickandmorty_api.model.dto.LocationDTO;
import br.com.samuelgaitkoski.rickandmorty_api.repository.LocationRepository;
import br.com.samuelgaitkoski.rickandmorty_api.util.LocationMapping;

public class LocationService {
    
    @Autowired
    private LocationRepository locationRepository; 

    public LocationDTO insertOrUpdate(LocationDTO location) { 
        var result = locationRepository.save(LocationMapping.toLocation(location)); 
        return LocationMapping.fromLocation(result);
    }

    public List<LocationDTO> findAll() {
        return locationRepository.findAll().stream().map(location -> LocationMapping.fromLocation(location)).
        collect(Collectors.toList());
    }

    public LocationDTO findById(int id) {
        var result = locationRepository.findById(id);

        if(result.isPresent()) {
            return LocationMapping.fromLocation(result.get());
        } 
        else {
            return new LocationDTO(); 
        }
    }

    public LocationDTO findByName(String name) {
        var result = locationRepository.findByName(name);

        if(result.isPresent()) {
            return LocationMapping.fromLocation(result.get());
        }
        return new LocationDTO();
    }

    public List<LocationDTO> findByType(String type) {
        return locationRepository.findByType(type).stream().map(location -> LocationMapping.
        fromLocation(location)).collect(Collectors.toList());
    }
    
}
