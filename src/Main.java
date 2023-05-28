import com.engeto.hotel.BookingManager;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Reservation;
import com.engeto.hotel.Room;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Guest guestAdela;
        //guestAdela = new Guest("Adéla Malíková");
        //guestAdela.setDateOfBirth(LocalDate.of(1993, 3, 13));

        //Guest guestJan;
        //guestJan = new Guest("Jan Dvořáček");
        //guestJan.setDateOfBirth(LocalDate.of(1995, 5, 5));

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

        //Reservation reservation2;
        //reservation2 = new Reservation (room3, guestJan, guestAdela);
        //reservation2.setDate(LocalDate.of(2021, 9, 1));
        //reservation2.setDateEnd(LocalDate.of(2021, 9, 14));

        Reservation reservationA;
        reservationA = new Reservation (room3, guestKarel, true,
                LocalDate.of(2023, 06, 01), LocalDate.of(2023, 06, 07));

        Reservation reservationB;

       // reservationB = new Reservation(room2,guestABC, false, )

        System.out.println("+");
        System.out.println("+");
        System.out.println("+");
        System.out.println("=== Seznam rezervací hotelu ===");


        List<Reservation> guestList = new ArrayList<>();
        //guestList.add(reservation1);
        //guestList.add(reservation2);
        guestList.add(reservationA);

        for (Reservation reservation : guestList) {
           System.out.println(reservation.getReservationDescription());
        }
        BookingManager bookingManager;
        bookingManager = new BookingManager();


        //System.out.println(bookingManager.getNumberOfBookings(1));
        System.out.println(bookingManager.getReservations());
    }
    }
