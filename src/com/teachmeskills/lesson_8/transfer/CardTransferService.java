package com.teachmeskills.lesson_8.transfer;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;

public interface CardTransferService {

    // TODO сделать возвращаемое значение Check (класс лежит в пакете document)
    // TODO добавить входные параметры в метод: карта с..., карта на..., сумма трансфера
    public Check transferFromCardToCard(BaseCard cardFromTransfer, BaseCard cardToTransfer, double transferSum);

    // TODO сделать возвращаемое значение Check (класс лежит в пакете document)
    // TODO добавить входные параметры в метод: карта с.., счет на..., сумма трансфера
    public Check transferFromAccountToAccount(Account accountFromTransfer, Account accountToTransfer, double transferSum);

}
