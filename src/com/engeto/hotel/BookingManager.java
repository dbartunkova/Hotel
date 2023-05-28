package com.engeto.hotel;
import java.util.List;
import java.util.ArrayList;

public class BookingManager {
    private List<Reservation> guestList;
    int numberOfBookings = 0;
    List<Reservation> results = new ArrayList<>();
    public void addReservation(Reservation newReservation) {
        results.add(newReservation);
    }

    public List<Reservation> getReservations() {
        return new ArrayList<>(results);
    }

    //public List<Reservation> add(Reservation newReservation) {
       // this.guestList = this.guestList + newReservation;
       //return this.guestList;
        //;String
    //}
    //public List<Reservation> getReservations(){
       // return this.guestList;
   // }

    //public List<Reservation> getGuestList() {
       // return guestList;
    //}
   public int getGuestList() {
        return numberOfBookings;
    }
    public int getNumberOfBookings(int numberOfBookings) {
       return this.numberOfBookings = numberOfBookings;
    }
    //public List<Reservation> getNumberOfReservation(Reservation reservation) {
        //this guestList += reservation;
       // return this.guestList;
   // }


}
