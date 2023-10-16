import java.util.*;


class BusDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus(1, true, 3));
        buses.add(new Bus(2, false, 5));
        buses.add(new Bus(3,true, 2));


        for (Bus b : buses) {
            b.displayBusInfo();
        }

        int userOpt = 1;

        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to Exit");

            userOpt = sc.nextInt();

            if (userOpt == 1) {
                System.out.println("Booking...........");
            }
        }
    }
}