public class test {
    public static void main(String[] args) {
        int counter = 1, c = 0;
        while (counter++ < 20) {
            counter = ++counter + 1;
            c += 1;
        }
        System.out.println("c" + c);
    }
}