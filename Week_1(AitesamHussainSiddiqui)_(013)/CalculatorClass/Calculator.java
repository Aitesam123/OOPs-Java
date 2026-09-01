package CalculatorClass;

public class Calculator {

    //attributes of the class
    private double num1;
    private double num2;
    private double result;
    private static int ObjectCount = 0;

    //Null Constructor
    public Calculator(){
        
        this.num1 = 0;
        this.num2 = 0;
        ObjectCount++;
    
    }

    //Parameterized Constructor
    public Calculator(double Num1, double Num2){
        
        this.num1 = Num1;
        this.num2 = Num2;
        this.result = 0;
        ObjectCount++;
    
    }

    //Copy Constructor
    public Calculator(Calculator C){

        this.num1 = C.num1;
        this.num2 = C.num2;
        this.result = 0;
        ObjectCount++;

    }

    //ObjectCount Function
    public static int ObjectCount(){
        
        return ObjectCount;

    }

    //Getters
    double getNum1(){

        return this.num1;
    
    }

    double getNum2(){

        return this.num2;

    }

    //Setters
    public void setNum1Num2(double Num1, double Num2){
        
        this.num1 = Num1;
        this.num2 = Num2;

    }

    //Functions
    public double Add(){

        return this.result = num1 + num2;

    }

    public double Subtract(){

        return this.result = num1 - num2;

    }

    public double Multiply(){

        return this.result = num1 * num2;

    }

    public double Divide(){

        if(num2 == 0){
            System.out.println("Denominator must not be 0, because the answer will become infinte.");
        }

        return this.result = num1 / num2;
    
    }

    public double Modulus(){

        if(num2 == 0){
            System.out.println("Denominator must not be 0, beacause the answer will become infinite.");
        }

        return this.result = num1 % num2;

    }

    public double Average(){

        return this.result = ( num1 + num2 ) / 2 ;

    }

    public String toString() {

        return ("Num 1:"+num1+"\nNum 2:"+num2+"\ncalculate :"+this.result+"\nobject count:"+Calculator.ObjectCount());
    
    }

    //show 
    void show() {
        System.out.println(this.toString());
        System.out.println("X-----------------------------------------------X");
        System.out.println();
    }

}
