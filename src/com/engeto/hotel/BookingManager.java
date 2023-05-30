package com.engeto.hotel;
import java.util.List;
import java.util.ArrayList;

public class BookingManager {
    private List<Reservation> guestList = new ArrayList<>();

    int numberOfBookings = 0;

    public void addReservation(Reservation newReservation) {
        guestList.add(newReservation);
    }

    public List<Reservation> getReservations() {
        return new ArrayList<>(guestList);
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
   //public int getGuestList() {
       // return numberOfBookings;
   // }
   // public int getNumberOfBookings(int numberOfBookings) {
      // return this.numberOfBookings = numberOfBookings;
   // }
    //public List<Reservation> getNumberOfReservation(Reservation reservation) {
        //this guestList += reservation;
       /// }


}
