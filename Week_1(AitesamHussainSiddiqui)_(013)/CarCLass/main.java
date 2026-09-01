public class main {
    public static void main ( String[] args){
        
        Car bmw = new Car();
        bmw.display();

        Car lamborghini = new Car();
        lamborghini.display();
        
        bmw.setdetails("Black","BMW");
        lamborghini.setdetails("Cyan","Lamborghini");

        bmw.StartEngine();
        bmw.display();

        lamborghini.StartEngine();
        lamborghini.display();
        
        bmw.Acceleration(20);
        bmw.display();

        lamborghini.Acceleration(70);
        lamborghini.display();

        bmw.TurnRight();
        bmw.display();

        lamborghini.TurnLeft();
        lamborghini.display();

        bmw.TurboMode();
        bmw.display();

        lamborghini.TurboMode();
        lamborghini.display();

        bmw.driftmode();
        bmw.display();

        lamborghini.driftmode();
        lamborghini.display();

        bmw.Brake();
        bmw.display();

        lamborghini.StopEngine();
        lamborghini.display();
        
    }
}

// =====================================================================
//                        MEMORY MAP  (main.java)
// =====================================================================

//   STACK      -> holds the main() frame + local reference variables
//   HEAP       -> holds the actual objects (created by "new")
//
//
//
//   STACK MEMORY                          HEAP MEMORY
//
//  +-----------------------+             +--------------------------------+
//  |  main() Frame         |             | String[] Object  (args)        |
//  |                       |             |  [ ]  (empty, no CLI args)      |
//  |  args --------------------------->  +--------------------------------+
//  |                       |
//  |  bmw ---------------------------->  +--------------------------------+
//  |                       |             | Car Object #1  (bmw)  @0x100   |
//  |  lamborghini ------------+          |  speed      : 20.0             |
//  |                       |  |          |  angle      : 90.0             |
//  +-----------------------+  |          |  colour     : "unknown"        |
//                             |          |  brand      : "unknown"        |
//                             |          |  engineON   : false            |
//                             |          |  direction  : "forward"        |
//                             |          |  fuel       : 100              |
//                             |          |  turboMode  : false            |
//                             |          +--------------------------------+
//                             |
//                             +------->  +--------------------------------+
//                                        | Car Object #2 (lamborghini)    |
//                                        |               @0x200           |
//                                        |  speed      : 20.0             |
//                                        |  angle      : 90.0             |
//                                        |  colour     : "unknown"        |
//                                        |  brand      : "unknown"        |
//                                        |  engineON   : false            |
//                                        |  direction  : "forward"        |
//                                        |  fuel       : 100              |
//                                        |  turboMode  : false            |
//                                        +--------------------------------+
