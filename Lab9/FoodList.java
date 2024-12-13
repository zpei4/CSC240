import java.io.*;
import java.util.*;

public class FoodList {
    
    private Food head;
    public void add(Food food) {
        if (head == null) {
            head = food;
        } else {
            Food current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = food;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("No foods in the list.");
            return;
        }
        System.out.println("============================================================================");
        System.out.println("Name                Food Group          Calories            Daily percentage");
        System.out.println("============================================================================");
        Food current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public Food find(String name) {
        Food current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeHighCalorieFoods(int calorieLimit) {
        while (head != null && head.calories > calorieLimit) {
            head = head.next;
        }
        Food current = head;
        while (current != null && current.next != null) {
            if (current.next.calories > calorieLimit) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public List<Food> getRandomFoods(int count) {
        List<Food> allFoods = new ArrayList<>();
        Food current = head;
        while (current != null) {
            allFoods.add(current);
            current = current.next;
        }
        Collections.shuffle(allFoods);
        return allFoods.subList(0, Math.min(count, allFoods.size()));
    }
}
