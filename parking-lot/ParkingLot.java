class ParkingLot {
    int numberOfLevels;
    List<ParkingLevel> levels;
    ParkingLot(int numberOfLevels) {
        this.numberOfLevels = numberOfLevels;
    }
    void addLevel(int totalSpots, int levelNumber) {
        levels.add(new ParkingLevel(totalSpots, levelNumber));
    }
    
    boolean parkVehicle(Vehicle vehicle) {
        for(ParkingLevel l: this.levels) {
            if(l.isAvailable()) {
                l.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
}