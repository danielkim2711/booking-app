package cs.daniel.bookingapp;

public class User {
    private String licenceNumber;
    private String lastName;
    private String dateOfBirth;
    private String day;
    private int hour;

    public User(String licenceNumber, String lastName, String dateOfBirth) {
        this.licenceNumber = licenceNumber;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public User(String day, int hour) {
        this.day = day;
        this.hour = hour;
    }

//    public boolean bookTimeslot(String licenceNumber, String day, int hour) {
//        if (hour < 9 || hour > 16)
//            return false;
//
//        for (Timeslot t: timeslots) {
//            if (t.getDay().equals(day) && t.getHour() == hour) {
//                if (t.getUsers().size() >= 10) {
//                    return false;
//                }
//                else if (t.licenceNumber)
//                else {
//                    t.getUsers().add(licenceNumber);
//                }
//            }
//        }
//        return false;
//    }

    public void getTimeslotBooking(String licenceNumber) {

    }

    public void getSlots(String day) {

    }
}
