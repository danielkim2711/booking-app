package cs.daniel.bookingapp;

import java.util.ArrayList;

public class Timeslot extends User {
    ArrayList<Timeslot> timeslots = new ArrayList<Timeslot>();
    String []days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private int startTime = 9;

    public Timeslot() {
        for (int day = 0; day < days.length; day++) {
            for (int time = 9; time < 17; time++) {
                timeslots.add(new Timeslot(days[day], time));
            }
        }
    }

    public boolean bookTimeslot(String licenceNumber, String day, int hour) {
        if (hour < 9 || hour > 16)
            return false;

        for (Timeslot t: timeslots) {
            if (t.getDay().equals(day) && t.getHour() == hour) {
                if (t.getUsers().size() >= 10) {
                    return false;
                }
                else if (t.licenceNumber)
                else {
                    t.getUsers().add(licenceNumber);
                }
            }
        }
        return false;
    }

    public
}
