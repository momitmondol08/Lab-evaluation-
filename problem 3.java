
public class Logger {

    private static Logger obj;

    private Logger() {
    }

    public static Logger getInstance() {

        if (obj == null) {
            obj = new Logger();
        }

        return obj;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
public class Main {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Hello");
        l2.log("Welcome");
        l1.log("OOP");

        System.out.println("Same Object: " + (l1 == l2));
    }
}   
  
