package Lab2.Task3;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Calendar;

public class Ticket {

    private LocalDate date;
    private Passenger passenger;
    private Flight flight;
    private Airport departure;

    private int cost;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Ticket(LocalDate date, Passenger passenger, Flight flight, Airport departure, int cost) {
        this.date = date;
        this.passenger = passenger;
        this.flight = flight;
        this.departure = departure;
        this.cost = cost;
    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
