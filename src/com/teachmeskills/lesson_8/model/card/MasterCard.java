package com.teachmeskills.lesson_8.model.card;

import java.util.Date;

import static com.teachmeskills.lesson_8.utils.Constants.MASTERCARD_LIMIT;

public class MasterCard extends BaseCard {

    public String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, String country, double amount) {
        super(cardNumber, cvv, validDate, cardHolder, currency, amount);
        this.country = country;
    }

    @Override
    public boolean checkCardLimitTransfer(double transferSum) {
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит
        return transferSum <= MASTERCARD_LIMIT;
    }
}
