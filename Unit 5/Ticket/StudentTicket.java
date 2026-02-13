
import java.util.Date;

public class StudentTicket extends StandardTicket {

    private static final double STUDENT_DISCOUNT = 0.50;

    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    public double getTotalPrice() {
        double each = super.getTax() * super.getBasePrice() + super.getBasePrice();
        return (each * super.ticketCount) * STUDENT_DISCOUNT;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }
}
