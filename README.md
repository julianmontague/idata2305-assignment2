# Assignment 2

## Running the code

With the root folder of this git repository open in the terminal, execute `mvn verify`. Then navigate to the classes directory with `cd target/classes` and run `java no.ntnu.idata2305.juliangm.assignment2.Main`.

## Observations

### Before synchronization

Each client is first told that there are 10 seats available, despite other logs showing that other clients have booked seats. The last client in the logs is told that 10 seats are available, but then despite requesting less than 10 seats is told that seats are not available.

The reason for this is that all the clients are requesting seats at the same time, so there is not time for the values to update. However by the time the last client requests and the server checks to see if there are enough, it seems to have updated.

### After synchronization

By adding the `synchronized` keyword to the `bookTicket` method, only one thread is allowed to run the method at a time. This way, the method is guaranteed to finish before another client runs it again. As a result, the correct number of available seats are displayed in the logs.
