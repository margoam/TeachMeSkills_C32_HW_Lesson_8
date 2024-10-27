package com.teachmeskills.lesson_8.model.client;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;

public class LegalClient extends BaseClient {

    String legalClientNumber;

    public LegalClient(Account[] accounts, String name, BaseCard[] cards, String legalClientNumber) {
        super(accounts, name, cards);
        this.legalClientNumber = legalClientNumber;
    }
}
