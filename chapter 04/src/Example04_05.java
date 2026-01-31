import java.util.Scanner;

public class Example04_05 {
    public static void startMain() {
        Scanner input = new Scanner(System.in);
        DataClass data = new DataClass();
        String output = "";
        System.out.print("Enter number 1 : ");
        data.num1 = Integer.parseInt(input.next());
        System.out.print("Enter number 2 : ");
        data.num2 = Integer.parseInt(input.next());
        output = "Before call method\n";
        output += "from data.num1 = " + data.num1 + ", data.num2 = " + data.num2 + "\n";
        System.out.println(output);
        changeValue(data);
        output = "After call method\n";
        output += "from data.num1 = " + data.num1 + ", data.num2 = " + data.num2 + "\n";
        input.close();
    }

    public static void changeValue(DataClass ob) {
        int temp = ob.num1;
        ob.num1 = ob.num2;
        ob.num2 = temp;
    }

    public class DataClass {
        int num1, num2;

    }
}
