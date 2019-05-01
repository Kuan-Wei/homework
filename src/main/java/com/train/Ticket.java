package com.train;

public class Ticket {
    int one_way_tickets;
    int round_trip_tickets;

    public Ticket(int one_way_tickets, int round_trip_tickets) {
        this.one_way_tickets = one_way_tickets;
        this.round_trip_tickets = round_trip_tickets;
    }

    public void print(){
        int total = ( one_way_tickets - round_trip_tickets) * 1000
                + round_trip_tickets * 1800;
        System.out.println("Total tickets:"+ one_way_tickets);
        System.out.println("Round-trip:"+ round_trip_tickets);
        System.out.println("Total:"+ total );
    }
}
