class Client {
    public static void main(String args[]) {
        
        String vehicleType;
        System.out.println("Please input desired vehicleType : ");
        System.in(vehicleType);

        Vehicle v = getVehicle(vehicleType);
    }
}