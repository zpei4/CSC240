public class Life {
    private String nameFirst;
    private String nameLast;
    private int age;
    private double term;
    private double commission;
    
    public Life(String nameFirst, String nameLast, int age, double term){
        this.nameFirst=nameFirst;
        this.nameLast=nameLast;
        this.age=age;
        this.term=term;
    }
    
    public void computeCommission(){
        this.commission=this.term*0.2;
    }
    
    public String getFirstName(){
        return this.nameFirst;
    }
    
    public String getLastName(){
        return this.nameLast;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getTerm(){
        return this.term;
    }
    
    public String toString(){
        return "Life Policy"+"\n"+"-------"+"\n"+"Name: "+this.nameFirst
        +" "+ this.nameLast+"\n"+"Age: "+this.age+"\n"+"Term: $"+this.term
        +"\n"+"Commission: $"+this.commission+"\n";
    }
}
