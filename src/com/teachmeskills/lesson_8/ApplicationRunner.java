package com.teachmeskills.lesson_8;

import com.teachmeskills.lesson_8.document_parser.IParser;
import com.teachmeskills.lesson_8.fabric.ParserFabric;
import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.card.MasterCard;
import com.teachmeskills.lesson_8.model.card.VisaCard;
import com.teachmeskills.lesson_8.model.client.IndividualClient;
import com.teachmeskills.lesson_8.model.client.LegalClient;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.impl.MasterCardTransferService;
import com.teachmeskills.lesson_8.transfer.impl.VisaCardTransferService;


import java.util.Date;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {
        // TODO запросить с консоли путь и имя файла
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a path to a file with it's name: ");
        String userInput = scanner.nextLine();

        // TODO сделать метод createParser статичным и избавиться от необходимости создания объекта parserFabric
        // TODO заменить "" на имя файла, полученное со сканера
        IParser parser = ParserFabric.createParser(userInput);
        parser.parseFile(userInput);

        // TODO реализовать тестовый сценарий
        // создать двух клиентов
        // каждому клиенту создать два счета и две карты
        // перевести с карты одного клиента на карту другого сумму денег
        // перевести с карты одного клинента на счет другого клиента сумму денег

        Account[] client1Accounts = {new Account("PLN242342342342434", 21234),
                new Account("PLN24234234242342434", 2342234)};
        Account[] client2Accounts = {new Account("US234234234234", 2342344),
                new Account("US234234234234", 234234)};

        MasterCardTransferService cardTransfer = new MasterCardTransferService();
        VisaCardTransferService accountTransfer = new VisaCardTransferService();

        BaseCard[] client1Cards = {
                new MasterCard("123123123123123", 234, new Date(2030, 10, 12), "Test1 User", "EUR", "PLN", 23245),
                new VisaCard("23423423423423", 456, new Date(2030, 10, 12), "Test1 User", "EUR", 12,2345)
        };

        BaseCard[] client2Cards = {
                new MasterCard("2342342342", 444, new Date(2028, 10, 15), "Corporation", "USD", "USA",44456),
                new VisaCard("34534534534", 333, new Date(2028, 8, 17), "Corporation", "USD", 3,334)
        };

        IndividualClient client1 = new IndividualClient(client1Accounts, "Rita A", client1Cards, "MC123456");
        LegalClient client2 = new LegalClient(client2Accounts, "Corporation", client2Cards, "Test12345");

        Check check1 = cardTransfer.transferFromCardToCard(client1.cards[0], client2.cards[1], 3466);
        check1.showCheckInfo();

        Check check2 = accountTransfer.transferFromAccountToAccount(client1.accounts[1], client2.accounts[0], 42342345);
        check2.showCheckInfo();

    }
}
