public class ParkingSlot {

    int slotId;
    VehicleType vehicleType;
    boolean isOccupied;
    Vehicle currentVehicle;


    ParkingSlot(int slotId, VehicleType vehicleType,  boolean isOccupied){
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.isOccupied = isOccupied;
    }

    public void parkVehicle(Vehicle vehicle){
        currentVehicle = vehicle;
        isOccupied = true;
    }

    public void removeVehicle(){
        currentVehicle = null;
        isOccupied = false;
    }
}
