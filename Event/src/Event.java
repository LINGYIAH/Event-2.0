import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    private ArrayList<Attendee> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, LocalDate eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    public void addAttendee(Attendee attendee) {
        eventAttendees.add(attendee);
    }

    public void showEventDetails() {
        System.out.println("Event Details:");
        System.out.println("ID: " + eventID);
        System.out.println("Name: " + eventName);
        System.out.println("Venue: " + eventVenue);
        System.out.println("Date: " + eventDate);
        System.out.println("Attendees: ");
        for (Attendee attendee : eventAttendees) {
            System.out.println(attendee);
        }
        System.out.println("Total number of attendees: " + eventAttendees.size());
    }


    public void organizeEvent() {
        System.out.println("Showing the list of attendees:");
        for (Attendee attendee : eventAttendees) {
            System.out.println(attendee);
        }
        System.out.println("Total number of attendees: " + eventAttendees.size());
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<Attendee> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<Attendee> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event ID: ").append(eventID)
                .append("\nEvent Name: ").append(eventName)
                .append("\nEvent Venue: ").append(eventVenue)
                .append("\nEvent Date: ").append(eventDate)
                .append("\nAttendees:\n");
        for (Attendee attendee : eventAttendees) {
            sb.append(attendee).append("\n");
        }
        return sb.toString();
    }
}
