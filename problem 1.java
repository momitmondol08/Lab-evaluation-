package com.mycompany.labevaluation;
import java.util.Scanner;
public class Calculator {
    double hours;
    double rate;

    Calculator(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }
    double calculatePay() {
        return hours * rate;
    }
}
package com.mycompany.labevaluation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double hours = input.nextDouble();
        double rate = input.nextDouble();

        Calculator c = new Calculator(hours, rate);

        System.out.printf("Total Pay: %.2f%n", c.calculatePay());

        input.close();
    }
}
