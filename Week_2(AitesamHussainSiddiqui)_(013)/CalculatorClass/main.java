package CalculatorClass;


public class main {
    public static void main(String [] args){

        // --- creation phase: 3 objects on the heap, no-arg constructor each time
        Calculator Casio = new Calculator();    // HEAP Obj#1 {num1=0.0,num2=0.0,result=0.0}; ObjectCount 0 -> 1; stack ref 'Casio'
        Casio.show();                           // read-only: prints 0.0 / 0.0 / 0.0 / count 1

        Calculator Citizen = new Calculator();  // HEAP Obj#2 {0.0,0.0,0.0}; ObjectCount 1 -> 2; stack ref 'Citizen'
        Citizen.show();                         // read-only: 0.0 / 0.0 / 0.0 / count 2

        Calculator C3 = new Calculator();       // HEAP Obj#3 {0.0,0.0,0.0}; ObjectCount 2 -> 3; stack ref 'C3'
        C3.show();                              // read-only: 0.0 / 0.0 / 0.0 / count 3

        System.err.println("Case 1:");          // goes to System.err (not out); no memory change
        Casio.show();                           // read-only

        System.out.println("Case 2:");
        Citizen.show();                         // read-only

        System.out.println("Case 3:");
        C3.show();                              // read-only

        Casio.setNum1Num2(40, 20);              // WRITE Obj#1: num1 = 40.0, num2 = 20.0
        Casio.show();                           // Obj#1 now 40.0 / 20.0 / result still 0.0

        Casio.getNum2();                        // returns 20.0 but nobody stores it -> NO-OP
        Casio.show();                           // unchanged

        Citizen.getNum1();                      // returns 0.0, ignored -> NO-OP
        Citizen.show();                         // unchanged

        //Subtraction
        Citizen.Subtract();                     // WRITE Obj#2: result = 0.0 - 0.0 = 0.0
        Citizen.show();

        //Multiplication
        C3.Multiply();                          // WRITE Obj#3: result = 0.0 * 0.0 = 0.0
        C3.show();

        //Division
        C3.Divide();                            // num2==0 -> prints warning; WRITE Obj#3: result = 0.0 / 0.0 = NaN
        C3.show();

        //Division by Zero
        Casio.setNum1Num2(30, 0);               // WRITE Obj#1: num1 = 30.0, num2 = 0.0
        Casio.Divide();                         // num2==0 -> prints warning; WRITE Obj#1: result = 30.0 / 0.0 = Infinity
        Casio.show();

        //Modulus
        Citizen.Modulus();                      // num2==0 -> prints warning; WRITE Obj#2: result = 0.0 % 0.0 = NaN (overwrites the 0.0)
        Citizen.show();

        /* ---------------------------------------------------------------------
           FINAL HEAP STATE when main() returns:
             Obj#1 (Casio)   -> num1=30.0  num2=0.0  result=Infinity
             Obj#2 (Citizen) -> num1=0.0   num2=0.0  result=NaN
             Obj#3 (C3)      -> num1=0.0   num2=0.0  result=NaN
           METHOD AREA: static ObjectCount = 3
           STACK: main() frame with refs Casio, Citizen, C3  ->  all popped on return
           --------------------------------------------------------------------- */

    }
}
