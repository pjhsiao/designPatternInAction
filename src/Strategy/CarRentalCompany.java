package Strategy;

public class CarRentalCompany implements ICarRentalCompany{
    @Override
    public void maxSpeed(ICar car) {
        car.maxSpeed();
    }
}
