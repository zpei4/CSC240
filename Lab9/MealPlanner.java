import java.io.*;
import java.util.*;

public class MealPlanner {
    public static void main(String[] args) {
        FoodList foodList = new FoodList();
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader("foods.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                String foodGroup = parts[1];
                int calories = Integer.parseInt(parts[2]);
                double dailyPercentage = Double.parseDouble(parts[3]);
                foodList.add(new Food(name, foodGroup, calories, dailyPercentage));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        while (true) {
            System.out.println("\n---------------------------------");
            System.out.println("Welcome to Meal Planner");
            System.out.println("---------------------------------");
            System.out.println("1 - List food database");
            System.out.println("2 - Create meal by manual selection");
            System.out.println("3 - Create meal by random selection");
            System.out.println("4 - Remove foods high in calorie");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    foodList.display();
                    break;
                case 2:
                    createMealManually(scanner, foodList);
                    break;
                case 3:
                    createMealRandomly(foodList);
                    break;
                case 4:
                    System.out.print("Enter calorie limit: ");
                    int calorieLimit = scanner.nextInt();
                    foodList.removeHighCalorieFoods(calorieLimit);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createMealManually(Scanner scanner, FoodList foodList) {
        List<Food> selectedFoods = new ArrayList<>();
        while (selectedFoods.size() < 3) {
            System.out.print("Enter food name: ");
            String foodName = scanner.nextLine();
            Food food = foodList.find(foodName);
            if (food != null) {
                selectedFoods.add(food);
            } else {
                System.out.println("Food " + foodName + " not in database, try again");
            }
        }
        printMeal(selectedFoods);
    }

    private static void createMealRandomly(FoodList foodList) {
        List<Food> randomFoods = foodList.getRandomFoods(3);
        printMeal(randomFoods);
    }

    private static void printMeal(List<Food> foods) {
        int totalCalories = 0;
        double totalDailyPercentage = 0;
        System.out.println("\n===============================");
        System.out.println("Your selected meal");
        System.out.print("Foods: ");
        for (Food food : foods) {
            System.out.print(food.name + " ");
            totalCalories += food.calories;
            totalDailyPercentage += food.dailyPercentage;
        }
        System.out.println("\nTotal calorie count: " + totalCalories);
        System.out.println("Total daily percentage: " + (totalDailyPercentage * 100) + "%");
        System.out.println("===============================");
    }
}
