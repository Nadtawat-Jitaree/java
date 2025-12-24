import java.util.Scanner;

public class Example02_11 {
    public static void main(String[] args) {
        String name1, name2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name 1 : ");
        name1 = scan.nextLine();
        System.out.print("Enter your name 2 : ");
        // .next แสดงแค่ ที่ไม่เว้น
        name2 = scan.next();
        System.out.println("You entered name1 : \"" + name1 + "\"");
        System.out.println("You entered name2 : \"" + name2 + "\"");
        scan.close();
        
    }
}
