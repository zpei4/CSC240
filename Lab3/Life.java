public class Life extends Policy {
    private int age;
    private double term;
    private double commission;

    public Life(String firstName, String lastName, int age, double term) {
        super(firstName, lastName);
        this.age = age;
        this.term = term;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }

    @Override
    public void computeCommission() {
        commission = term * 0.20;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + age + "\nTerm: $" + term + "\nCommission: $" + commission;
    }
}
