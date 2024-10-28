package com.teachmeskills.lesson_8.model.document;

import java.util.Date;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты
// TODO создать метод для вывода информации о чеке на экран
public class Check {

    double transferSum;
    Date transferDate;
    String cardNumber;


    public Check(double transferSum, Date transferDate, String cardNumber) {
        this.transferSum = transferSum;
        this.transferDate = transferDate;
        this.cardNumber = cardNumber;
    }

    public Check() {
        System.out.println("Check is unsuccessful");
    }

    public void showCheckInfo() {
        System.out.println("Transfer sum is: " + transferSum + "\nTransfer date is: " +
                transferDate + "\nCard/Account number is: " + cardNumber);
    }
}
