class Car{
    //attributes of the class
    private float speed;
    private float angle;
    private String colour;
    private String brand;
    private boolean engineON;
    private String direction;
    private int fuel;
    private boolean turboMode;
    private static int objectCount = 0;


    //Null Constructor
    public Car(){       

        this.speed = 20;
        this.angle = 90;
        this.colour="unknown";
        this.brand="unknown";
        this.turboMode=false;
        this.engineON=false;
        this.fuel= 100;
        this.direction = "forward";
        objectCount++;
        
    }

    //Parameterized Constructor
    public Car (float Speed , float Angle, String Colour, String Brand, Boolean EngineOn, Boolean TurboMode){
        
        this.speed = Speed;
        this.angle = Angle;
        this.fuel = 100;
        this.colour = Colour;
        this.brand = Brand;
        this.direction = "forward";
        this.engineON = EngineOn;
        this.turboMode = TurboMode;
        objectCount++;
    
    }

    //Copy Constructor
    public Car (Car C){

        this.speed = C.speed;
        this.angle = C.angle;
        this.fuel = C.fuel;
        this.colour = C.colour;
        this.brand = C.brand;
        this.direction = C.direction;
        this.engineON = C.engineON;
        this.turboMode = C.turboMode;
        objectCount++;

    }

    //ObjectCount Function
    public static int ObjectCount(){
        
        return objectCount;
    
    }

    //Getters
    float getSpeed(){

        return this.speed;

    }

    float getAngle(){

        return this.angle;

    }

    //Setters
    public void setSpeedAngle(float Speed, float Angle){

        this.speed = Speed;
        this.angle = Angle;

    }

    public void setdetails(String Colour, String Brand){
        
        this.colour = Colour;
        this.brand = Brand;
    
    }

    //Functions
    public void StartEngine(){

        this.engineON = true;
        System.out.println(this.brand + " engine started." );
    
    }

    public void StopEngine(){

        this.speed = 0;
        this.turboMode = false;
        this.engineON = false;
        System.out.println(this.brand + " engine stoped.");
        
    }

    public void fuel(){

        this.fuel = 100;

    }

    public void TurboMode(){

        this.turboMode = true;
        this.speed += 50;

    }

    public void Acceleration(float Acceleration){

        if(!this.engineON){

            System.out.println("Engine is off, Please turn on the engine first.");
            return;

        }
        else{

            this.speed += Acceleration;
        
        }
    }

    public void Brake(){

        this.turboMode = false;
        this.speed = 0;

    }

    public void TurnRight(){

        this.direction = "right";
        this.angle += 45;

    }

    public void TurnLeft(){

        this.direction = "left";
        this.angle -= 45;

    }

    public void driftmode(){
    
        this.angle+=45;
        if(this.speed>0){

            this.speed=this.speed/2;
        
        }
        System.out.println(this.brand + " is drifting at an angle of " + this.angle + " degrees."+"at speed of" + this.speed+"km/h");
        
    }

    public String toString(){

        return ("speed is:"+ this.speed+"Km/h" +",\nangle is:"+this.angle+" degrees"+",\nEngine state:"+this.engineON+" \nobject count:"+Car.ObjectCount());
    
    }

    public void display(){

        System.out.println("Brand:"+this.brand);
        System.out.println("Colour:"+this.colour);
        System.out.println(this.toString());
        System.out.println("Fuel:"+this.fuel+"%");
        System.out.println("Direction:"+this.direction);
        System.out.println("turbo mode: "+(this.speed>100));
        System.out.println();
        System.out .println("X----------------------------------------X");
        System.out.println();
    
    }

}