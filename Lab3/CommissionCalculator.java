import java.util.Scanner;

public class CommissionCalculator {
    private Auto autoPolicy;
    private Home homePolicy;
    private Life lifePolicy;

    public CommissionCalculator() {
        autoPolicy = new Auto("", "", "", "", 0.0, 0.0);
        homePolicy = new Home();
        lifePolicy = new Life("", "", 0, 0.0);
    }

    public void Run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-----------------------------");
            System.out.println("Welcome to Parkland Insurance");
            System.out.println("-----------------------------");
            System.out.println("Enter any of the following:");
            System.out.println("1) Enter auto insurance policy information");
            System.out.println("2) Enter home insurance policy information");
            System.out.println("3) Enter life insurance policy information");
            System.out.println("4) Compute commission and print auto policy");
            System.out.println("5) Compute commission and print home policy");
            System.out.println("6) Compute commission and print life policy");
            System.out.println("7) Quit");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Enter name of insured:");
                    String autoName = scanner.nextLine();
                    System.out.println("Enter make of automobile:");
                    String make = scanner.nextLine();
                    System.out.println("Enter model of automobile:");
                    String model = scanner.nextLine();
                    System.out.println("Enter liability coverage amount:");
                    double liability = scanner.nextDouble();
                    System.out.println("Enter collision coverage amount:");
                    double collision = scanner.nextDouble();
                    autoPolicy = new Auto(autoName, "", make, model, liability, collision);
                    break;

                case 2:
                    System.out.println("Enter name of insured:");
                    String homeName = scanner.nextLine();
                    System.out.println("Enter house square footage:");
                    int footage = scanner.nextInt();
                    System.out.println("Enter dwelling coverage amount:");
                    double dwelling = scanner.nextDouble();
                    System.out.println("Enter contents coverage amount:");
                    double contents = scanner.nextDouble();
                    System.out.println("Enter liability coverage amount:");
                    double homeLiability = scanner.nextDouble();
                    homePolicy = new Home();
                    homePolicy.setFirstName(homeName);
                    homePolicy.setFootage(footage);
                    homePolicy.setDwelling(dwelling);
                    homePolicy.setContents(contents);
                    homePolicy.setLiability(homeLiability);
                    break;

                case 3:
                    System.out.println("Enter name of insured:");
                    String lifeName = scanner.nextLine();
                    System.out.println("Enter age of insured:");
                    int age = scanner.nextInt();
                    System.out.println("Enter term life coverage amount:");
                    double termLife = scanner.nextDouble();
                    lifePolicy = new Life(lifeName, "", age, termLife);
                    break;

                case 4:
                    autoPolicy.computeCommission();
                    System.out.println(autoPolicy);
                    break;

                case 5:
                    homePolicy.computeCommission();
                    System.out.println(homePolicy);
                    break;

                case 6:
                    lifePolicy.computeCommission();
                    System.out.println(lifePolicy);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        scanner.close();
    }
}
