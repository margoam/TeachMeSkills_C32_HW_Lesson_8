package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;

import java.util.Date;

// TODO реализовать имплементацию интерфейса
public class MasterCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard cardFromTransfer, BaseCard cardToTransfer, double transferSum) {
        if (cardFromTransfer.checkCardLimitTransfer(transferSum) && transferSum > 0 && transferSum <= cardFromTransfer.amount) {
            cardFromTransfer.amount -= transferSum;
            cardToTransfer.amount += transferSum;
            return new Check(transferSum, new Date(), cardFromTransfer.cardNumber,
                    "Transfer was completed successfully");
        }
        return new Check(transferSum, new Date(), cardFromTransfer.cardNumber,
                "Transfer was completed unsuccessfully");
    }

    @Override
    public Check transferFromAccountToAccount(Account accountFromTransfer, Account accountToTransfer, double transferSum) {
        if (accountFromTransfer.checkAccountLimitTransfer(transferSum) && transferSum > 0 && transferSum <= accountFromTransfer.amount) {
            accountFromTransfer.amount -= transferSum;
            accountToTransfer.amount += transferSum;
            return new Check(transferSum, new Date(), accountFromTransfer.accountNumber,
                    "Transfer was completed successfully");
        }
        return new Check(transferSum, new Date(), accountFromTransfer.accountNumber,
                "Transfer was completed unsuccessfully");
    }
}
