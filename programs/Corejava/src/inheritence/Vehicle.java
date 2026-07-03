package inheritence;

public class Vehicle extends Object {

    String model;
    String brand;
    int year;

    public Vehicle(){

    }

    public Vehicle(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void drive(){
        System.out.println("Drive vehicle with 80 km speed");
    }

    public void vehicleMaintenance() {

        System.out.println("Vehicle is under maintance");
    }
}
