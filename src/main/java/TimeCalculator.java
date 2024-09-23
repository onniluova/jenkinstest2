public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();

        // Example usage
        double distance = 100; // km
        double speed = 60; // km/h

        try {
            double time = calculator.calculateTime(distance, speed);
            System.out.printf("Time to travel %.2f km at %.2f km/h: %.2f hours%n", distance, speed, time);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}