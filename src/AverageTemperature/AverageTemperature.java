package AverageTemperature;

import java.util.Scanner;
import java.util.ArrayList;

public class AverageTemperature {
    static void main(String[] args) {
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Average Temperature Calculator!");
        System.out.println("Enter the number of temperatures you'd like to average: ");
        count = input.nextInt();

        double[] temps = new double[count];
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            System.out.println("Enter temperature " + (i + 1) + ": ");
            temps[i] = input.nextDouble();
            sum += temps[i];
        }

        double average = sum / count;
        System.out.println("The average temperature is " + average);

        ArrayList<Double> aboveAvg = new ArrayList<>();
        for (double temp : temps) {
            if (temp > average) {
                aboveAvg.add(temp);
            }
        }

        if (aboveAvg.isEmpty()) {
            System.out.println("There are no temperatures that are above the average temperature.");
        } else if (aboveAvg.size() == 1) {
            System.out.println("The temperature that is above the average temperature is " + aboveAvg);
        } else {
            System.out.println("The temperatures that are above the average temperature are " + aboveAvg);
        }
        input.close();
    }
}
