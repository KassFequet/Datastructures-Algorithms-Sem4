package MovieTheatre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MovieTheatre {

    // Seat layout 2D Array
    private static final int[][] seatLayout = {
            {11, 12, 13, 14, 15},
            {21, 22, 23, 24, 25},
            {31, 32, 33, 34, 35},
            {41, 42, 43, 44, 45},
            {51, 52, 53, 54, 55}
    };

    // Reserved seats ArrayList
    private static final ArrayList<Integer> reservedSeats = new ArrayList<>();

    static void main(String[] args) {

        while (true) {
            System.out.println("\nWelcome to the Movie Theatre!");
            System.out.println("Please select what you would like to do");
            System.out.println("1. Reserve a Seat");
            System.out.println("2. Cancel a Reserved Seat");
            System.out.println("3. View All Seats");
            System.out.println("4: View all Reserved Seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    reserveSeat();
                    break;
                case 2:
                    cancelSeat();
                    break;
                case 3:
                    viewAllSeats();
                    break;
                case 4:
                    viewReservedSeats();
                    break;
                case 5:
                    System.out.println("\nThanks for using the Movie Theatre Menu. Goodbye!");
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

        // Method to reserve a seat - Uses isSeatValid to check if seat number is valid - If seat is already reserved, suggests a random available seat
        private static void reserveSeat() {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the seat number you would like to reserve: ");
            int seatNumber = input.nextInt();
            if (!isValidSeat(seatLayout, seatNumber)) {
                System.out.println("Invalid Seat Number");
            } else if (reservedSeats.contains(seatNumber)) {
                System.out.println("Seat Already Reserved");
                Random random = new Random();
                while (true) {
                    int randomRowIndex = random.nextInt(seatLayout.length);
                    int randomColumnIndex = random.nextInt(seatLayout[0].length);
                    int randomValue = seatLayout[randomRowIndex][randomColumnIndex];

                    if (!reservedSeats.contains(randomValue)) {
                        System.out.println("Seat " + randomValue + " is available.");
                        break;
                    }
                }
            } else {
                reservedSeats.add(seatNumber);
                System.out.println("Seat " + seatNumber + " has been reserved.");
            }
        }

        // Method to cancel a reserved seat - Checks if the seat is in the reservedSeats list - if not informs user that seat is not reserved
        private static void cancelSeat() {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the seat number you would like to cancel: ");
            int seatNumber = input.nextInt();
            if (reservedSeats.remove(Integer.valueOf(seatNumber))) {
                System.out.println("Reservation for seat " + seatNumber + " cancelled.");
            } else {
                System.out.println("Seat " + seatNumber + " is not reserved.");
            }
        }

        // Method to view all seats - Displays the entire seat layout from the seatLayout 2D array
        private static void viewAllSeats() {
            System.out.println("All Seats");
            System.out.println(Arrays.deepToString(seatLayout));
        }

        // Method to view reserved seats - Displays the list of reserved seats from the reservedSeats ArrayList
        private static void viewReservedSeats() {
            System.out.println("Reserved Seats");
            System.out.println(reservedSeats);
        }

        // Helper method to check if a seat number is valid
        private static boolean isValidSeat(int[][] seatLayout, int seatNumber) {
        for (int[] row : seatLayout) {
            for (int seat : row) {
                if (seat == seatNumber) return true;
            }
        }
        return false;
    }


}
