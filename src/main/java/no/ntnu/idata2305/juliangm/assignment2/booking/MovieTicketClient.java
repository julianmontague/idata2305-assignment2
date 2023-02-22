package no.ntnu.idata2305.juliangm.assignment2.booking;

/**
 *
 * @author julian
 */
public class MovieTicketClient extends Thread {
    String customerName;
    int numberOfTickets;
    MovieTicketServer server;

    public MovieTicketClient(String name, int tickets, MovieTicketServer movieServer) {
        this.customerName = name;
        this.numberOfTickets = tickets;
        this.server = movieServer;
    }

    @Override
    public void run() {
        this.server.bookTicket(this.customerName, this.numberOfTickets);
    }
}
