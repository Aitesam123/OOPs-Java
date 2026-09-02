public class main {
    public static void main(String[] args) {
        System.out.println("---------- Point Demo ----------");
    //NULL 
    Point p1=new Point();
    p1.show();

    //PARAMETERIZED
    Point p2=new Point(5,6);
    p2.show();

    // COPY
    Point p3=new Point(p1);
    p3.show();

    //SUBTRACT 
    Point p4=p2.minus(p1);
    p4.show();

    //MIDPOINT
    Point p5=p1.midPoint(p2);
    p5.show();
    
    //EQUALS
    System.out.println(p1.equals(p2));

    // ADDITION
    Point p6=p2.plus(p1);
    p6.show();

    // //SLOPE
    System.out.println("Slope: "+ String.format("%.2f", p1.slope(p2)));
   

    // DISTANCE Between points
    System.out.println("Distance: "+ String.format("%.2f", p2.distanceTo(p1)));



    }
} 
