class DivZero extends Exception {

    DivZero(String msg) {
        super(msg);
    }
}
class NegNum extends Exception {

    NegNum(String msg) {
        super(msg);
    }
}
class Calc {
    int div(int a, int b) throws DivZero, NegNum {

        if (a < 0 || b < 0) {
            throw new NegNum("Negative number");
        }
        if (b == 0) {
            throw new DivZero("Cannot divide by zero");
        }
        return a / b;
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calc c = new Calc();
        try {
            System.out.println(c.div(a, b));
        } catch (DivZero e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NegNum e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
