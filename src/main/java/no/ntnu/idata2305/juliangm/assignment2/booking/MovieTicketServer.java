package no.ntnu.idata2305.juliangm.assignment2.booking;
public class MovieTicketServer {
    // TBD

    String movieName;
    int availableSeats;
    public MovieTicketServer() {
        // TBD
    }

    public void bookTicket(String customerName, int numberOfSeats) {
        System.out.println("Hi," + customerName + " : " + availableSeats + " : Seats available for " + movieName);

        if ((availableSeats - numberOfSeats) < 0) {
            System.out.println("Hi," + customerName + " : Seats not available for " + movieName);
        } else {
            availableSeats = availableSeats - numberOfSeats;
        }
        System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for" + movieName);
    }
}