import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gradebook gradebook = new Gradebook(5);

        System.out.println("Enter details for 5 students in the format: <firstName> <lastName> <score>");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student: ");
            String firstName = scanner.next();
            String lastName = scanner.next();
            int score;
            
            while (true) {
                try {
                    score = scanner.nextInt();
                    if (score < 0 || score > 100) {
                        throw new IllegalArgumentException("Score must be between 0 and 100.");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid score (0-100). Try again.");
                    scanner.nextLine(); // Clear invalid input
                }
            }

            gradebook.addStudent(new Student(firstName, lastName, score));
        }

        System.out.println("\nSorting students by score in descending order...\n");
        gradebook.sortStudents();
        gradebook.printStudents();

        scanner.close();
    }
}
