package com.teachmeskills.lesson_8.model.document;

import java.util.Date;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты
// TODO создать метод для вывода информации о чеке на экран
public class Check {

    double transferSum;
    Date transferDate;
    String cardNumber;
    private final boolean isSuccessful;
    String message;


    public Check(double transferSum, Date transferDate, String cardNumber, boolean isSuccessful) {
        this.transferSum = transferSum;
        this.transferDate = transferDate;
        this.cardNumber = cardNumber;
        this.isSuccessful = isSuccessful;
    }

    public Check(boolean isSuccessful, String message) {
        this.isSuccessful = isSuccessful;
        this.message = message;
    }

    public void showCheckInfo() {
        if (isSuccessful) {
            System.out.println("Transfer sum is: " + transferSum + "\nTransfer date is: " +
                    transferDate + "\nCard/Account number is: " + cardNumber);
        }
        else {
            System.out.println(message);
        }
    }
}
