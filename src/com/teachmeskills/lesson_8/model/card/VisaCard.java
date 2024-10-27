package com.teachmeskills.lesson_8.model.card;

import java.util.Date;

import static com.teachmeskills.lesson_8.utils.Constants.VISA_LIMIT;

public class VisaCard extends BaseCard {

    int cashback;

    public VisaCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, int cashback) {
        super(cardNumber, cvv, validDate, cardHolder, currency);
        this.cashback = cashback;
    }

    @Override
    public boolean checkCardLimitTransfer(double transferSum) {
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит
        return transferSum <= VISA_LIMIT;
    }
}
