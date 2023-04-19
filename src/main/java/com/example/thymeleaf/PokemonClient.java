package com.example.thymeleaf;

import com.example.thymeleaf.model.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class PokemonClient {
    public ArrayList<Datum> getPokemon(String name) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Root> exchange = restTemplate.exchange(
                String.format("https://api.pokemontcg.io/v2/cards?q=name:%s", name),
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Root.class);
        return exchange.getBody().getData();
    }
    public Datum getOnePokemon(String name, Integer i){
        return getPokemon(name.substring(0,1).toUpperCase() + name.substring(1)).get(i);
    }
}
