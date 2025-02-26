package interfaceex;

public interface Rentable {
    void calculateRent(int days);
}
class CarRental implements Rentable{

    @Override
    public void calculateRent(int days) {
        int carRent = 100;
        System.out.println("Car rent " + (days * carRent));
    }
}

class BikeRental implements Rentable{

    @Override
    public void calculateRent(int days) {
        int bikeRent = 50;
        System.out.println("Bike rent " + (days * bikeRent));
    }
}

class MainEx{
    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.calculateRent(3);

        BikeRental b = new BikeRental();
        b.calculateRent(7);
    }
}