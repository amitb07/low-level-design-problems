
class ParkingDemo {
    public static void main(String[] args) {
        ParkingLot lot1 = new ParkingLot();
        lot1.addLevel(1, 25);
        lot1.addLevel(2, 20);
        lot1.addLevel(3, 15);
        

        Vehicle v1 = new Vehicle("4-wheeler", "MH20AB7777");
        Vehicle v2 = new Vehicle("4-wheeler", "MH23AB1777");
        Vehicle v3 = new Vehicle("4-wheeler", "MH01AB2777");
        Vehicle v4 = new Vehicle("4-wheeler", "MH24AB3777");

        lot1.parkVehicle(v1);
        lot1.parkVehicle(v2);

        lot1.displayAvailability();

        lot1.parkVehicle(v3);
        lot1.parkVehicle(v4);
        
        lot1.displayAvailability();
    }
}