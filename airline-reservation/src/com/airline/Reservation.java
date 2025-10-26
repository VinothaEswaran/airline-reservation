package com.airline;

public class Reservation {
    private String passengerName;
    private Flight flight;

    public Reservation(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public void confirmBooking() {
        System.out.println("\n✅ Booking Confirmed!");
        System.out.println("Passenger: " + passengerName);
        flight.displayInfo();
    }
}
