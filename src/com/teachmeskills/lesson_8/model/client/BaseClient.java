package com.teachmeskills.lesson_8.model.client;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;

public abstract class BaseClient {

    public String name;
    public Account[] accounts;
    public BaseCard[] cards;

    public BaseClient(Account[] accounts, String name, BaseCard[] cards) {
        this.accounts = accounts;
        this.name = name;
        this.cards = cards;
    }
}
