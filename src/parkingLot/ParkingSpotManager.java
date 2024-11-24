package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingSpotManager(List<ParkingSpot> list){
        this.parkingSpotList = list;
    }
    void findParkingSpace(){
        for(ParkingSpot parkingSpot: parkingSpotList){
            if(parkingSpot.isEmpty){
                System.out.println("spot is available with id " + parkingSpot.getId());
                return;
            }
        }
        System.out.println("No available parking spaces");

    }

    public void addParkingSpace(ParkingSpot newSpot) {
        parkingSpotList.add(newSpot);
        System.out.println("Added new parking space with ID: " + newSpot.getId());
    }

    // Remove a parking space
    public void removeParkingSpace(int spotId) {
        ParkingSpot spotToRemove = null;
        for (ParkingSpot spot : parkingSpotList) {
            if (spot.getId() == spotId) {
                spotToRemove = spot;
                break;
            }
        }

        if (spotToRemove != null) {
            parkingSpotList.remove(spotToRemove);
            System.out.println("Removed parking spot with ID: " + spotId);
        } else {
            System.out.println("No parking spot found with ID: " + spotId);
        }
    }

    // Park a vehicle
    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpotList) {
            if (!spot.isEmpty) {
                spot.parkVehicle(vehicle);
                System.out.println("Vehicle " + vehicle.vehicleNo + " parked at spot " + spot.getId());
                return;
            }
        }
        System.out.println("No available parking spots for " + vehicle.vehicleNo);
    }

    // Remove a vehicle
    public void removeVehicle(int spotId) {
        ParkingSpot spotToVacate = null;
        for (ParkingSpot spot : parkingSpotList) {
            if (spot.getId() == spotId && spot.isEmpty) {
                spotToVacate = spot;
                break;
            }
        }

        if (spotToVacate != null) {
            spotToVacate.removeVehicle();
            System.out.println("Vehicle removed from spot " + spotId );
        } else {
            System.out.println("No vehicle found at spot " + spotId);
        }
    }

}
