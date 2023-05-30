import com.engeto.hotel.BookingManager;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Reservation;
import com.engeto.hotel.Room;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guestKarel;
        guestKarel = new Guest("Karel Dvořák");

        Guest guestABC;
        guestABC = new Guest ("ABC Relax");

        Guest guestAlena;
        guestAlena = new Guest ("Alena Krásová");


        Room room1;
        room1 = new Room(1, 1, 1000, true, true );
        Room room2;
        room2 = new Room(2, 1, 1000, true, true );
        Room room3;
        room3 = new Room(3, 3, 2400, false, true );


        //System.out.println(guestAdela.getNameSurname() + " " + "(" + guestAdela.getDateOfBirth() + ")");
        //System.out.println(guestJan.getNameSurname() + " " + "(" + guestJan.getDateOfBirth() + ")");
        System.out.println("=== Seznam hostů ===");
        //System.out.println(guestAdela.getDescription());
        //System.out.println(guestJan.getDescription());
        System.out.println("+");
        System.out.println("+");
        System.out.println("+");
        System.out.println("=== Nabídka pokojů ===");
        System.out.println("Pokoje" + " " + room1.getRoomNumber() + " a "
                + room2.getRoomNumber() + " mají tento počet lůžek: " + room1.getNumberOfBeds()+
        " a mají výhled do zahrady i balkón. Cena za noc za pokoj je: " + room1.getPrice() + " Kč.");
        System.out.println("Pokoj" + " " + room3.getRoomNumber() + " má tento počet lůžek: " + room3.getNumberOfBeds()+
                " a má balkón. Výhled do zahrady nemá. Cena za noc za tento pokoj je: " + room3.getPrice() + " Kč.");


        //Reservation reservation1;
        //reservation1 = new Reservation (room1, guestAdela, guestAdela);
        //reservation1.setDate(LocalDate.of(2021, 7, 19));
        //reservation1.setDateEnd(LocalDate.of(2021, 7, 26));


        System.out.println("+");
        System.out.println("+");
        System.out.println("+");
        System.out.println("=== Seznam rezervací hotelu ===");


        BookingManager bookings = new BookingManager();

        Reservation reservationA;
        reservationA = new Reservation (room3, guestKarel, true,
                LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7));

        bookings.addReservation(reservationA);




        List<Reservation> guestList = new ArrayList<>();

        guestList.add(reservationA);

        for (Reservation reservation : guestList) {
           System.out.println(reservation.getReservationDescription());
        }
        BookingManager bookingManager;
        bookingManager = new BookingManager();

        Reservation reservationB;

        for (int i = 1; i < 30; i++){
            reservationB = new Reservation(room2,guestABC, false,
                    LocalDate.of(2023, 6, i), LocalDate.of(2023, 6, 2));
            bookings.addReservation(reservationB);
            System.out.println(i);

        };

        // bookings.addReservation(reservationB);



        //System.out.println(bookings.getReservations());


    }
    }
