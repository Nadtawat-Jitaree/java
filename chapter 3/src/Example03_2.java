
import java.util.Scanner;

public class Example03_2 {
    public static void main(String[] args) {
        int num1,num2,num3,num4,min = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        if(num1 < num2 && num1 < num3 && num1 < num4)
            min = num1;
        else if (num2 < num1 && num2 < num3 && num2 < num4)
            min = num2;
        else if (num3 < num1 && num3 < num2 && num3 < num4)
            min = num3;
        else
            min = num4;
        
        System.out.println("Minimun value : "+min);
        scanner.close();
    }
}

// public class Example03_2 {
//     public static void main(String[] args) {
//         int num1,num2,num3,num4,min = 0;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter three integers : ");
//         num1 = scanner.nextInt();
//         num2 = scanner.nextInt();
//         num3 = scanner.nextInt();
//         num4 = scanner.nextInt();
//         if(num1 < num2)
//             if(num1 < num3)
//                 min = num1;
//             else
//                 min = num3;
//         else if (num2<num3)
//             min = num2;
//         else
//             min = num3;
        
//         System.out.println("Minimun value : "+min);
//         scanner.close();
//     }
// }
