import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Booking {
    String PassengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Passenger Name : ");
        PassengerName = scan.nextLine();
        System.out.println("Enter the Bus No : ");
        busNo = scan.nextInt();
        System.out.println("Enter the Date (dd-mm-yyyy) : ");
        String dateinput = scan.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateinput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;

        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }


        int booked = 0;

        for (Booking book : bookings) {
            if (book.busNo == busNo && book.date.equals(date))
            booked++;
        }

        return booked<capacity ? true : false;
    }
}