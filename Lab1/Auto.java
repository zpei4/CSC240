public class Auto {
    private String nameFirst;
    private String nameLast;
    private String model;
    private String make;
    private double lia;
    private double col;
    private double commission;

    public Auto(String nameFirst, String nameLast, String make, String model, 
    double lia, double col){
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.make = make;
        this.model = model;
        this.lia=lia;
        this.col=col;
    }
    
    public void computeCommission(){
        this.commission = (this.lia+this.col)*0.3;
    }
    
    public String toString(){
        return "Auto Policy"+"\n"+"-------"+"\n"+"Name: "+this.nameFirst
        +" "+ this.nameLast+"\n"+"Make: "+this.make+"\n"+"Model: "+this.model
        +"\n"+"Liability: $"+this.lia+"\n"+"Collision: $"+this.col+"\n"+
        "Commission: $"+this.commission+"\n";
    }
}
