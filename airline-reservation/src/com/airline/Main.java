package com.airline;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flight[] flights = {
            new Flight("AI101", "Chennai", "Delhi"),
            new Flight("AI202", "Mumbai", "Bangalore"),
            new Flight("AI303", "Hyderabad", "Kolkata")
        };

        System.out.println("✈️ Welcome to Airline Reservation System");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nAvailable Flights:");
        for (int i = 0; i < flights.length; i++) {
            System.out.print((i + 1) + ". ");
            flights[i].displayInfo();
        }

        System.out.print("\nChoose a flight (1-3): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice >= 1 && choice <= flights.length) {
            Reservation reservation = new Reservation(name, flights[choice - 1]);
            reservation.confirmBooking();
        } else {
            System.out.println("❌ Invalid choice. Try again.");
        }

        sc.close();
    }
}

