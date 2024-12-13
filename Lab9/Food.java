import java.io.*;
import java.util.*;

public class Food {
    String name;
    String foodGroup;
    int calories;
    double dailyPercentage;
    Food next;

    public Food(String name, String foodGroup, int calories, double dailyPercentage) {
        this.name = name;
        this.foodGroup = foodGroup;
        this.calories = calories;
        this.dailyPercentage = dailyPercentage;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-15d %-15.2f", name, foodGroup, calories, dailyPercentage);
    }
}
