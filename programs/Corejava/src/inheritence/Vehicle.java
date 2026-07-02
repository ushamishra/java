package inheritence;

public class Vehicle {

    String model;
    String brand;
    int year;

    public Vehicle(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void drive(){
        System.out.println("Drive vehicle with 80 km speed");
    }
}
