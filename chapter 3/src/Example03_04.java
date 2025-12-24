import java.util.Scanner;

public class Example03_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week : ");
        int dayOfWeek = scanner.nextInt();
        String dayName;
        switch (dayOfWeek){
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            default: dayName = "unknow";
        
        }
        System.out.println("Day of week : "+dayOfWeek);
        System.out.println("Day Name : "+dayName);
    }
}
