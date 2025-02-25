class ParkingLevel {
    int levelNumber, totalSpots;
    List<ParkingSpot> availableSpots;
    List<ParkingSpot> occupiedSpots;

    ParkingLevel(int totalSpots, int levelNumber) {
        this.totalSpots = totalSpots;
        this.levelNumber = levelNumber;
        availableSpots = new ArrayList<>();
        occupiedSpots = new ArrayList<>();
        for(int i=1; i<=totalSpots; i++)
            availableSpots.add(new ParkingSpot(levelNumber, i));
    }

    boolean isAvailable() {
        return availableSpots.size() > 0;
    }

    boolean parkVehicle(Vehicle vehicle) {
        if(availableSpots.size() > 0) {
            ParkingSpot freeSpot = availableSpots.get(0);
            freeSpot.vehicle = vehicle;
            availableSpots.remove(0);
            occupiedSpots.add(freeSpot);
            return true;
        }
        return false;
    }
}