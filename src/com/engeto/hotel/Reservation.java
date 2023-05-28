package com.engeto.hotel;
import java.time.LocalDate;

public class Reservation {
    private Room room;
    private Guest guest;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private boolean isWorking;


    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }
    public LocalDate getDateStart() {
        return dateStart;
    }

    public Reservation(Room room, Guest guest, boolean isWorking, LocalDate dateStart, LocalDate dateEnd) {
        this.room = room;
        this.guest = guest;
        this.isWorking = isWorking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;


    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }
    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }
    public String getReservationDescription() {
        return "Jméno hosta/ů: "+guest.getNameSurname() + " a číslo pokoje: " +
                room.getRoomNumber() + ". " +
                "Ubytování od: " + dateStart + " do: " + dateEnd + ". " + "Pracovní pobyt: "
                + isWorking;
    }




}
