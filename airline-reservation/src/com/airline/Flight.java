package com.airline;

public class Flight {
    private String flightNumber;
    private String source;
    private String destination;

    public Flight(String flightNumber, String source, String destination) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void displayInfo() {
        System.out.println("Flight: " + flightNumber + " | " + source + " → " + destination);
    }
}
