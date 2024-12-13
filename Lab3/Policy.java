public abstract class Policy {
    private String firstName;
    private String lastName;

    public Policy(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract void computeCommission();

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName;
    }
}
