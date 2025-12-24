public class Example02_09 {
    public static void main(String[] args) {
        final Double PI = 3.1416;
        double width = 22.0, height = 12.0, radius = 16.0, result;
        char type;
        String message;

        type = '2';
        result = (type == '1') ? (width * height) : (PI * radius * radius);
        message = (type == '1') ? "Ractangle" : "Circle";

        System.out.println("Calculate Area " + message + " = " + result);
    }
}
