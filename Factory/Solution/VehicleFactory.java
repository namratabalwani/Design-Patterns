class VehicleFactory{
    public static Vehicle getVehicle(String vehicleType) {
        Vehicle v ;
        if (vehicleType == "Car") {
            v = new Car();
        } else if (vehicleType == "Bike") {
            v = new Bike();
        } else {
            v = new Vehicle();
        }
        v.createVehicle();

        return v;
    }
}