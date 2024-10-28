package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;

import java.util.Date;

// TODO реализовать имплементацию интерфейса
public class VisaCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard cardFromTransfer, BaseCard cardToTransfer, double transferSum) {
        if (cardFromTransfer.checkCardLimitTransfer(transferSum)) {
            return new Check(transferSum, new Date(), cardFromTransfer.cardNumber, true);
        }
        return new Check(false, "The check is unsuccessful");
    }

    @Override
    public Check transferFromAccountToAccount(Account accountFromTransfer, Account accountToTransfer, double transferSum) {
        if (accountFromTransfer.checkAccountLimitTransfer(transferSum)) {
            return new Check(transferSum, new Date(), accountFromTransfer.accountNumber, true);
        }
        return new Check(false, "The check is unsuccessful");
    }
}
