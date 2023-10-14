package Lab2.Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Airport> airports = new ArrayList<>();
    private List<Flight> flight = new ArrayList<>();
    private List<Passenger> passenger = new ArrayList<>();
    private List<Ticket> ticket = new ArrayList<>();

    public void addairport(Airport airport) {
        airports.add(airport);
    }

    public void editairport(Airport airport1, Airport airport2) {
        if (!airport1.equals(airport2)) {
            airports.remove(airport1);
            airports.add(airport2);
        } else {
            System.out.println("Airport not found" + airport2.getName());
        }
    }

    public void removeairport(Airport airport) {
        airports.remove(airport);
    }

    public void addflight(Flight flight) {
        this.flight.add(flight);
    }

    public void editflight(Flight flight1, Flight flight2) {
        if (!flight1.equals(flight2)) {
            this.flight.remove(flight1);
            this.flight.add(flight2);
        } else {
            System.out.println("Flight not found" + flight2.getName());
        }
    }

    public void removeflight(Flight flight) {
        this.flight.remove(flight);
    }


    public void addpassenger(Passenger passenger) {
        this.passenger.add(passenger);
    }

    public void editpassenger(Passenger passenger1, Passenger passenger2) {
        if (!passenger1.equals(passenger2)) {
            this.passenger.remove(passenger1);
            this.passenger.add(passenger2);
        } else {
            System.out.println("Passenger not found");
        }
    }

    public void removepassenger(Passenger passenger) {
        this.passenger.remove(passenger);
    }


    public void addticket(Ticket ticket) {
        this.ticket.add(ticket);
    }

    public void editticket(Ticket ticket1, Ticket ticket2) {
        if (!ticket1.equals(ticket2)) {
            this.ticket.remove(ticket1);
            this.ticket.add(ticket2);
        } else {
            System.out.println("Ticket not found");
        }
    }

    public void removeticket(Ticket ticket) {
        this.ticket.remove(ticket);
    }

    public void ShowAllFlights() {
        System.out.println("Available flights:");
        for (Flight flight : flight) {
            System.out.println(flight.getName());
        }
    }


    public void ShowPriceForPeriod(LocalDate date1, LocalDate date2) {
        int cost = 0;
        for (Ticket ticket : ticket) {
            if (ticket.getDate().isAfter(date1) && ticket.getDate().isBefore(date2)) {
                cost += ticket.getCost();
            }
        }
        System.out.println("\nCost for choose period = " + cost);
        ;
    }

}
