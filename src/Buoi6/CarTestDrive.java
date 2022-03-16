package Buoi6;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setcarcolor("red");
        car.setcarPrice(15000);
        System.out.println("- carcolor:" + car.getcarcolor());
        System.err.println("- carPrice" + car.getcarPrice());

    }

}
