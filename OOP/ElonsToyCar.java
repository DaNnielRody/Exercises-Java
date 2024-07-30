package OOP;

public class ElonsToyCar {

    private int percentage = 100;
    private int meters = 0;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven %s meters".formatted(meters);
    }

    public String batteryDisplay() {
        if(percentage == 0) {
            return "Battery empty";
        }
        return "Battery at %d%%".formatted(percentage);
    }

    public void drive() {
        if(percentage != 0) {
            meters += 20;
            percentage -= 1;
        }
    }
}
