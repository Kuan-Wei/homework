package com.train

import java.util.*

fun main() {
    println("Please enter number of tickets:")
    val scanner = Scanner(System.`in`)
    val one_way_tickets = scanner.nextInt()

    println("How many round-trip tickets:")
    val round_trip_tickets = scanner.nextInt()

    val ticket = Tickets(one_way_tickets, round_trip_tickets)
    ticket.print()
}

class Tickets(var one_way_tickets: Int, var round_trip_tickets: Int){
    fun print(){
        var total = ( ( one_way_tickets - round_trip_tickets) * 1000 )
        + ( round_trip_tickets * 1800 )

        println("Total tickets:"+ one_way_tickets)
        println("Round-trip:"+ round_trip_tickets)
        println("Total:"+ total )
    }
}