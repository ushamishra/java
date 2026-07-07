package inheritence;

public class Car extends Vehicle{

    boolean isAirconditioned;
    String carColor;

     static int noOfWheels = 4;

    public Car(){
        super();

    }

    public Car(String model, String brand, int year, boolean isAirconditioned, String carColor) {
        super(model, brand, year);
        this.isAirconditioned = isAirconditioned;
        this.carColor = carColor;
    }

      void s2(){

    }

      int x = 45;

    public  static void drive(Car c ) {
        c.s2();
        System.out.println("My can can drive 250 km max speed"+ c.x);
    }
}
