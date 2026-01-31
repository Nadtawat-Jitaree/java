public class Example04_01 {
    public void displayInstance() {
        System.out.println("Hello from Instance.");
    }

    public static void displayStatic() {
        System.err.println("Hello from Static.");
    }

    public static void main(String[] args) {
        System.err.println("Test call static method.");
        Example04_01.displayStatic();
        Example04_01 obj = new Example04_01();
        System.err.println("Test call instance method");
        obj.displayInstance();
    }
}