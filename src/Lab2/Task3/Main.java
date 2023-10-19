package Lab2.Task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Plane plane1 = new Plane("Boeing 737", 100);
        Plane plane2 = new Plane("Boeing 747", 200);
        Plane plane3 = new Plane("Boeing 757", 300);

        Airport airport1 = new Airport("Airport 1");
        Airport airport2 = new Airport("Airport 2");

        Flight flight1 = new Flight("Flight 1", plane1);
        Flight flight2 = new Flight("Flight 2", plane1);
        Flight flight4 = new Flight("Flight 4", plane3);

        Passenger passenger1 = new Passenger("Passenger 1", "Passenger 1");
        Passenger passenger2 = new Passenger("Passenger 2", "Passenger 2");
        Passenger passenger3 = new Passenger("Passenger 3", "Passenger 3");

        Ticket ticket1 = new Ticket(LocalDate.of(2013, 9, 23), passenger1, flight1, airport2, 100);
        Ticket ticket2 = new Ticket(LocalDate.of(2014, 9, 13), passenger2, flight2, airport1, 109);

        LocalDate dateStart = LocalDate.of(2013, 9, 1);
        LocalDate dateEnd = LocalDate.of(2013, 9, 30);

        Company company = new Company();
        company.addAirport(airport1);
        company.addAirport(airport2);
        company.addFlight(flight1);
        company.addFlight(flight1);
        company.removeFlight(flight2);
        company.editFlight(flight1, flight4);
        company.addTicket(ticket1);
        company.addTicket(ticket2);

        company.showAllFlights();
        company.showPriceForPeriod(dateStart, dateEnd);


    }
}
