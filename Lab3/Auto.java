public class Auto extends Policy {
    private String make;
    private String model;
    private double liability;
    private double collision;
    private double commission;

    public Auto(String firstName, String lastName, String make, String model, double liability, double collision) {
        super(firstName, lastName);
        this.make = make;
        this.model = model;
        this.liability = liability;
        this.collision = collision;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLiability() {
        return liability;
    }

    public void setLiability(double liability) {
        this.liability = liability;
    }

    public double getCollision() {
        return collision;
    }

    public void setCollision(double collision) {
        this.collision = collision;
    }

    @Override
    public void computeCommission() {
        commission = (liability + collision) * 0.30;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMake: " + make + "\nModel: " + model + "\nLiability: $" + liability + "\nCollision: $" + collision + "\nCommission: $" + commission;
    }
}
