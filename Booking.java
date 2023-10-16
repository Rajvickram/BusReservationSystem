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
        String dateinput = scan.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateinput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}