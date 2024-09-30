package enumeration;

public enum VehicleType {
    CAR(5.0), MOTORCYCLE(3.0), BUS(10.0), TRUCK(15.0);

    private double tollPrice;


VehicleType(double tollPrice) {
    this.tollPrice = tollPrice;
}

    public double getToll() {
        return tollPrice;
    }
}

