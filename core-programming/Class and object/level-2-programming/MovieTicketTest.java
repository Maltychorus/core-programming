class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked.");
        }
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Not Booked"));
    }
}

public class MovieTicketTest {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 12, 350.0);
        ticket.displayTicket();
        ticket.bookTicket();
        ticket.displayTicket();
    }
}