package java8features;

import java.util.function.Supplier;
public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Double> anyDoubleNum = () -> Math.random()*10;
        anyDoubleNum.get();
    }
}
