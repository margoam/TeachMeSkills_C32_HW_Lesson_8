package com.teachmeskills.lesson_8.model.account;

import static com.teachmeskills.lesson_8.utils.Constants.ACCOUNT_LIMIT;

public class Account {

    public String accountNumber;
    public double amount;

    public Account(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public boolean checkAccountLimitTransfer(double transferSum) {
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит
        return transferSum <= ACCOUNT_LIMIT;
    }
}
