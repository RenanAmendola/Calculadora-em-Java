package poo;

public class Number {

    private double Number_1;

    private double getNumber_1() {
        return Number_1;
    }

    private void setNumber_1(double Number_1) {
        this.Number_1 = Number_1;
    }

    public double sum(double Number_1, double Number_2){
        setNumber_1(Number_1 + Number_2);
        
        return getNumber_1();
        }
   
    public double sub(double Number_1, double Number_2){
        setNumber_1(Number_1 - Number_2);
        
        return getNumber_1();
        }
   
        
    public double mult(double Number_1, double Number_2){
        setNumber_1(Number_1 * Number_2);
        
        return getNumber_1();
        }
   
            
    public double div(double Number_1, double Number_2){
        setNumber_1(Number_1 / Number_2);
                
        return getNumber_1();
        }
               
    
}
