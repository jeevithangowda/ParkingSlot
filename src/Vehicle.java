abstract public class Vehicle {

    String licenseNumber;
    VehicleType vehicleType;

    Vehicle(String licenseNumber, VehicleType vehicleType){
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
