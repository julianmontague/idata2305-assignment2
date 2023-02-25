package no.ntnu.idata2305.juliangm.assignment2.booking;
public class MovieTicketServer {
    String movieName;
    int availableSeats;

    public MovieTicketServer(String name, int seats) {
        this.movieName = name;
        this.availableSeats = seats;
    }

    public synchronized void bookTicket(String customerName, int numberOfSeats) {
        System.out.println("Hi," + customerName + " : " + availableSeats + " : Seats available for " + movieName);

        if ((availableSeats - numberOfSeats) < 0) {
            System.out.println("Hi," + customerName + " : Seats not available for " + movieName);
        } else {
            availableSeats = availableSeats - numberOfSeats;
            System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for" + movieName);
        }
    }
}