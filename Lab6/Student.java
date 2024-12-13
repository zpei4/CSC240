public class Student {
    private String firstName;
    private String lastName;
    private int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int compareTo(Student other) {
        // Compare by score in descending order
        return Integer.compare(other.score, this.score);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + score;
    }
}
