package Level_2;

public class p5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double m) {
        return m * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("2 yards = " + convertYardsToFeet(2) + " feet");
        System.out.println("12 feet = " + convertFeetToYards(12) + " yards");
        System.out.println("1 meter = " + convertMetersToInches(1) + " inches");
        System.out.println("20 inches = " + convertInchesToMeters(20) + " meters");
        System.out.println("5 inches = " + convertInchesToCm(5) + " cm");
    }
}
