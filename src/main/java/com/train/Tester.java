package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets:");
        Scanner scanner = new Scanner( System.in );
        int one_way_tickets = scanner.nextInt();

        System.out.println("How many round-trip tickets:");
        int round_trip_tickets = scanner.nextInt();

        Ticket ticket = new Ticket(one_way_tickets, round_trip_tickets);
        ticket.print();
    }
}
