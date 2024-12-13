public class Home extends Policy {
    private int footage;
    private double dwelling;
    private double contents;
    private double liability;
    private double commission;

    public Home() {
        super("", "");
    }

    public int getFootage() {
        return footage;
    }

    public void setFootage(int footage) {
        this.footage = footage;
    }

    public double getDwelling() {
        return dwelling;
    }

    public void setDwelling(double dwelling) {
        this.dwelling = dwelling;
    }

    public double getContents() {
        return contents;
    }

    public void setContents(double contents) {
        this.contents = contents;
    }

    public double getLiability() {
        return liability;
    }

    public void setLiability(double liability) {
        this.liability = liability;
    }

    @Override
    public void computeCommission() {
        commission = (liability * 0.30) + ((dwelling + contents) * 0.20);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFootage: " + footage + "\nDwelling: $" + dwelling + "\nContents: $" + contents + "\nLiability: $" + liability + "\nCommission: $" + commission;
    }
}
