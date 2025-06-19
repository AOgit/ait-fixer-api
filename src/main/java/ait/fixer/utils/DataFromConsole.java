package ait.fixer.utils;

import java.util.Scanner;

public class DataFromConsole {
    private String from;
    private String to;
    private String amount;

    public DataFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter currency (from): ");
        this.from = scanner.nextLine();

        System.out.print("Enter currency (to): ");
        this.to = scanner.nextLine();

        System.out.print("Enter amount: ");
        this.amount = scanner.nextLine();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAmount() {
        return amount;
    }
}
