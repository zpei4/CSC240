public class Home {
    private String nameFirst;
    private String nameLast;
    private double con;
    private double dwell;
    private double foot;
    private double lia;
    private double commission;
    
    public void setFirstName(String name){
        this.nameFirst=name;
    }
    
    public void setLastName(String name){
        this.nameLast=name;
    }
    
    public void setContents(double con){
        this.con=con;
    }
    
    public void setDwelling(double dwell){
        this.dwell=dwell;
    }
    
    public void setFootage(double foot){
        this.foot=foot;
    }
    
    public void setLiability(double lia){
        this.lia=lia;
    }
    
    public void computeCommission(){
        this.commission = this.lia*0.3+((this.dwell+this.con)*0.2);
    }
    
    public String toString(){
        return "Home Policy"+"\n"+"-------"+"\n"+"Name: "+this.nameFirst
        +" "+ this.nameLast+"\n"+"Footage: "+this.foot+"\n"+"Dwelling: $"+this.dwell
        +"\n"+"Contents: $"+this.con+"\n"+"Liability: $"+this.lia+"\n"+
        "Commission: $"+this.commission+"\n";
    }
    
}
