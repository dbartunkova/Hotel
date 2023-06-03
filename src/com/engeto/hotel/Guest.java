package com.engeto.hotel;
import java.time.LocalDate;

public class Guest {
    private String nameSurname;
    private LocalDate dateOfBirth;

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Guest(String nameSurname, LocalDate dateOfBirth) {
        this.nameSurname = nameSurname;
        this.dateOfBirth = dateOfBirth;
    }
   public Guest(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getDescription() {
        return "Jméno hosta: "+nameSurname + " a datum narození: " + dateOfBirth;
    }
}
