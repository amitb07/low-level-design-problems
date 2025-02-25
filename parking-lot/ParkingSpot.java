class ParkingSpot {
    int spotNumber;
    Vehicle vehicle;
    int levelNumber;
    
    ParkingSpot(int level, int number) {
        this.levelNumber = level;
        this.spotNumber = number;
    }

    void parkVehicle(Vehicle vh) {
        this.vehicle = vh;
    }
    void unParkVehicle() {
        this.vehicle = null;
    }

    int getSpotNumber() {
        return this.spotNumber;
    }

    boolean isAvailable() {
        return vehicle == null;
    }
}