package com.teachmeskills.lesson_8.model.client;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;

public class IndividualClient extends BaseClient {

    String passportNumber;

    public IndividualClient(Account[] accounts, String name, BaseCard[] cards, String passportNumber) {
        super(accounts, name, cards);
        this.passportNumber = passportNumber;
    }
}
