package no.ntnu.idata2305.juliangm.assignment2;

import no.ntnu.idata2305.juliangm.assignment2.booking.MovieTicketClient;
import no.ntnu.idata2305.juliangm.assignment2.booking.MovieTicketServer;

/**
 *
 * @author julian
 */
public class Main {

    public static void main(String[] args) {
        MovieTicketServer server = new MovieTicketServer("The Banshees of Inisherin", 10);

        Thread t1 = new MovieTicketClient("Haseeb", 2, server);
        Thread t2 = new MovieTicketClient("Sora", 3, server);
        Thread t3 = new MovieTicketClient("Patrick", 5, server);
        Thread t4 = new MovieTicketClient("Andrea", 2, server);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
