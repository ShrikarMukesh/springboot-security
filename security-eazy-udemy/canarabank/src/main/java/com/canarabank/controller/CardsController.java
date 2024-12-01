package com.canarabank.controller;

import com.canarabank.model.Cards;
import com.canarabank.repository.CardsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CardsController {
    private final CardsRepository cardsRepository;

    public CardsController(CardsRepository cardsRepository){
        this.cardsRepository = cardsRepository;
    }


    @GetMapping("/myCards")
    public List<Cards> getCardDetails(@RequestParam int id) {
        List<Cards> cards = cardsRepository.findByCustomerId(id);
        if (cards != null ) {
            return cards;
        }else {
            return new ArrayList<>();
        }
    }

}
