public class Task implements Priority {
    private String taskName;
    private int priority;

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        setPriority(priority); // Use the setter to validate priority
    }

    @Override
    public void setPriority(int priority) {
        if (priority < 1 || priority > 5) {
            throw new IllegalArgumentException("Priority must be between 1 and 5.");
        }
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("%-20s priority: %d", taskName, priority);
    }
}
