public class Example02_07 {
    public static void main(String[] args) {
        int a = 10, b = 6;
        double y;

        System.out.println("When a = " + a + ", b = " + b + "\n");
        y = (a - b) * (a + b);
        System.out.println("y = (a-b) * (a+b) = " + y);
        y = 3 * ((a - b) * (a + b)) - 6;
        System.out.println("y = 3 * ((a-b)*(a+b))-6 = " + y);
        y = 1 - (2 * a) / (3 * b);
        System.out.println("y = 1 - (2*a) / (3*b) " + y);

    }
}
