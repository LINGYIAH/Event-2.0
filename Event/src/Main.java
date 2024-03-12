import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter event ID:");
        String eventID = scanner.nextLine();

        System.out.println("Enter event name:");
        String eventName = scanner.nextLine();

        System.out.println("Enter event venue:");
        String eventVenue = scanner.nextLine();

        System.out.println("Enter event date (yyyy-MM-dd):");
        String dateString = scanner.nextLine();
        LocalDate eventDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);

        Event event = new Event(eventID, eventName, eventVenue, eventDate);

        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1 - Add attendee");
            System.out.println("2 - Show event details and list of attendees");
            System.out.println("0 - Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Attendee newAttendee = Attendee.createAttendeeFromInput(scanner);
                    event.addAttendee(newAttendee);
                    break;
                case 2:
                    event.showEventDetails();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        scanner.close();
    }
}
