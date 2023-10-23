package com.oauth.SecurityOKTA.repository;


import com.oauth.SecurityOKTA.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Card getByCardNo(Long cardNo);
}
