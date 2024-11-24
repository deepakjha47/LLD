package parkingLot;

import java.util.ArrayList;

public class ParkingSpotManagerFactory {
    ParkingSpotManager getParkingSpotManager(){
        return new ParkingSpotManager(new ArrayList<>());
    }
}
