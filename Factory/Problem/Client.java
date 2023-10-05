class Client {
    public static void main(String args[]) {
        Vehicle v;
        String vehicleType;
        System.out.println("Please input desired vehicleType : ");
        System.in(vehicleType);

        if (vehicleType == "Car") {
            v = new Car();
        } else if (vehicleType == "Bike") {
            v = new Bike();
        }
        v.createVehicle();
    }
}