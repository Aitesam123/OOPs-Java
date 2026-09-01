package CalculatorClass;

public class main {
    public static void main(String [] args){

        Calculator Casio = new Calculator();
        Casio.show();

        Calculator Citizen = new Calculator();
        Citizen.show();

        Calculator C3 = new Calculator();
        C3.show();

        System.err.println("Case 1:");
        Casio.show();

        System.out.println("Case 2:");
        Citizen.show();

        System.out.println("Case 3:");
        C3.show();

        Casio.setNum1Num2(40, 20);
        Casio.show();

        Casio.getNum2();
        Casio.show();

        Citizen.getNum1();
        Citizen.show();

        //Subtraction
        Citizen.Subtract();
        Citizen.show();

        //Multiplication
        C3.Multiply();
        C3.show();

        //Division
        C3.Divide();
        C3.show();

        //Division by Zero
        Casio.setNum1Num2(30, 0);
        Casio.Divide();
        Casio.show();

        //Modulus
        Citizen.Modulus();
        Citizen.show();


    }
}
