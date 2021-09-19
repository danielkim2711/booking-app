package cs.daniel.bookingapp;

public class Booking {
    String licenceNumber;
    String day;
    int hour;

    public Booking(String licenceNumber, String day, int hour) {
        this.licenceNumber = licenceNumber;
        this.day = day;
        this.hour = hour;
    }

    public boolean bookTimeSlot(String licenceNumber, String day, int hour) {
        return true;
    }

    public void getTimeslotBooking(String licenceNumber) {
        
    }

    public void getSlots(String day) {

    }
}
