import java.util.*;


class BusDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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