package parkingLot;

public class EntryGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    void findSpace(VehicleType vehicleType, int entryGateNo){
        parkingSpotManagerFactory.getParkingSpotManager().findParkingSpace();
    }
    void bookSpot(Vehicle vehicle){

    }
    Ticket generrateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        return new Ticket();
    }
}
