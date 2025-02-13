package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entites.CreditCard;
import java.util.Optional;

@Repository
public interface CreditCardRepo extends JpaRepository<CreditCard, Long> {
    Optional<CreditCard> findByCardNumberAndCvc(String cardNumber, String cvc);
}