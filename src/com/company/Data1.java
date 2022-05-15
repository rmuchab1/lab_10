package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class Data1 {
    static Scanner input = new Scanner(System.in);
    static String accountNumber, count,
            url = "https:/haaaa url yenyu king mmmmm",
            bankName, bankAccount;
    static String[] data;

    public static void UsersData() throws IOException, NumberFormatException {
        URL link = new URL(url);
        InputStream ins = link.openStream();

        System.out.println("Welcome baba");
        System.out.print("acc number: ");
        accountNumber = input.nextLine();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(ins))) {
            while ((count = br.readLine()) != null) {
                data = count.split("\\t+");
                bankAccount = data[0].trim();
                bankName = data[1].trim();

                if (bankAccount.contains(accountNumber)) {
                    System.out.println(String.format("Bank Name: %s, " +
                            "Bank Account: %s", bankName, bankAccount));
                    return; // If user wants to log all the bank that contains(accountNumber),
                    // user has to comment on return.
                }

                if (!bankAccount.contains(accountNumber)) {
                    System.out.println("There is no bank account that you're looking for.");
                    return;
                }
            }
        }
    }
}
