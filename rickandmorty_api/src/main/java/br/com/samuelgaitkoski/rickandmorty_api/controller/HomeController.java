package br.com.samuelgaitkoski.rickandmorty_api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/docs")
    public String docs() {
        return "docs";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/api")
    public Map<String, String> home() {
        var map = new HashMap<String, String>();

        map.put("Personagem", "/api/personagem");
        map.put("Localização", "/api/localizacao");
        map.put("Episódios", "/api/episodios");
        
        return map;
    }

}
