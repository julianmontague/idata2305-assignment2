# Assignment 2

## Observations

### Before synchronization

Each client is first told that there are 10 seats available, despite other logs showing that other clients have booked seats. The last client in the logs is told that 10 seats are available, but then despite requesting less than 10 seats is told that seats are not available.

The reason for this is that all the clients are requesting seats at the same time, so there is not time for the values to update. However by the time the last client requests and the server checks to see if there are enough, it seems to have updated.
