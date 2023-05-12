package Strategy;

public class Main {
    private static final ICarRentalCompany carRentalCompany = new CarRentalCompany();

    public static void main(String[] args) {
        System.out.println("How max speed of sport car is?");
        ICar car = new SportCar();
        carRentalCompany.maxSpeed(car);

        System.out.println("==================================");
        System.out.println("How max speed of regular car is?");
        car = new RegularCar();
        carRentalCompany.maxSpeed(car);
    }
}
