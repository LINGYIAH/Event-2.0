import java.util.Scanner;

public class Attendee {
    private String name;
    private String gender;
    private int age;
    private String email;

    public Attendee(String name, String gender, int age, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    public static Attendee createAttendeeFromInput(Scanner scanner) {
        System.out.println("Enter attendee name:");
        String name = scanner.nextLine();

        System.out.println("Enter attendee gender (M/F):");
        String gender = scanner.nextLine();

        System.out.println("Enter attendee age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter attendee email:");
        String email = scanner.nextLine();

        return new Attendee(name, gender, age, email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Email: " + email;
    }
}