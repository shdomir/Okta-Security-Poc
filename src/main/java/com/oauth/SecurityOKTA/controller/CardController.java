package com.oauth.SecurityOKTA.controller;

import com.oauth.SecurityOKTA.model.Card;
import com.oauth.SecurityOKTA.model.Response;
import com.oauth.SecurityOKTA.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping("/get-card")
    public Response getCard(@RequestBody Long cardNo) {
        return cardService.getCard(cardNo);
    }

    @PostMapping("/save-card")
    public Response saveCard(@RequestBody Card card) {
        return cardService.saveCard(card);
    }
}
