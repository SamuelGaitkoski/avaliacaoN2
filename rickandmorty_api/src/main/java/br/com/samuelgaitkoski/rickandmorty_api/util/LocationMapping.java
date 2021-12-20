package br.com.samuelgaitkoski.rickandmorty_api.util;

import br.com.samuelgaitkoski.rickandmorty_api.model.Location;
import br.com.samuelgaitkoski.rickandmorty_api.model.dto.LocationDTO;

public class LocationMapping {
    
    private LocationMapping() {

    }

    public static LocationDTO fromLocation(Location location) {
        return new LocationDTO(location.getId(), location.getName(), location.getType(), location.getDimension());
    }

    public static Location toLocation(LocationDTO dto) {
        return new Location(dto.getId(), dto.getName(), dto.getType(), dto.getDimension());
    }
    
}
