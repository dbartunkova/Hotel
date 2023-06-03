package com.engeto.hotel;
import java.math.BigDecimal;
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
    public Reservation get(int index) {
        return guestList.get(index);
    }
   // public BigDecimal getNumberOfBookings() {
      //  BigDecimal result = BigDecimal.ZERO;
      //  for (Reservation reservation : guestList) {
         //   result = result.addReservations();
     //   }
      //  return result;
    //}



// public void getNumberOfBookings(){
     //   return
 //   }

}
