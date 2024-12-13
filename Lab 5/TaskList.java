interface Priority {
    void setPriority(int priority);
    int getPriority();
}

public class TaskList {
    public static void main(String[] args) {
        System.out.println("Priority Task List\n------------------");

        // Create an array of Task objects
        Task[] tasks = new Task[5];
        tasks[0] = new Task("Attend class", 1);
        tasks[1] = new Task("Homework", 2);
        tasks[2] = new Task("Exercise", 3);
        tasks[3] = new Task("Eat breakfast", 4);
        tasks[4] = new Task("Eat lunch", 5);

        // Print each task
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
