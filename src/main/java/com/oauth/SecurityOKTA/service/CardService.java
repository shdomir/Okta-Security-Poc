package com.oauth.SecurityOKTA.service;


import com.oauth.SecurityOKTA.model.Card;
import com.oauth.SecurityOKTA.model.Response;
import com.oauth.SecurityOKTA.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    public Response getCard(Long cardNo) {
        Response response = new Response();
        Card card = cardRepository.getByCardNo(cardNo);

        if (card != null) {
            response.setStatus(200);
            response.setMessage("Found Card No - " + card.getCardNo());
        }
        else {
            response.setStatus(500);
            response.setMessage("Card Not Found");
        }
        return response;
    }

    public Response saveCard(Card card) {
        Response response = new Response();
        Card cardResponse = null;
        try {
            cardResponse = cardRepository.save(card);
        } catch (Exception e) {
            response.setStatus(500);
            response.setMessage("Error Creating Card.");
        }

        if (cardResponse != null && cardResponse.getCardNo() != null) {
            response.setStatus(200);
            response.setMessage("Card Created Successfully, Card No - " + cardResponse.getCardNo());
        } else {
            response.setStatus(500);
            response.setMessage("Error Creating Card.");
        }
        return response;
    }
}
