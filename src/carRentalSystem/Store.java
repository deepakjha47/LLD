package carRentalSystem;

import carRentalSystem.product.Vehicle;
import carRentalSystem.product.VehicleType;

import java.util.*;
public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location StoreLocation;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return inventoryManagement.getVehicles();
    }

    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        System.out.println("Reservation completed");
        return true;
    }

    //update reservation



}
