package inheritence;

public class Car extends Vehicle{

    boolean isAirconditioned;
    String carColor;

    public Car(){
        super();

    }

    public Car(String model, String brand, int year, boolean isAirconditioned, String carColor) {
        super(model, brand, year);
        this.isAirconditioned = isAirconditioned;
        this.carColor = carColor;
    }


    @Override
    public void drive() {
        super.drive();
        System.out.println("My can can drive 250 km max speed");

    }
}
