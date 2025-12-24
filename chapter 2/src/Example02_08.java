public class Example02_08 {
    public static void main(String[] args) {
        boolean result = false;
        int number = 5;
        // String color = "red";
        String color = new String("red");
        // color = color.toString();
        System.out.println("When number = " + number + ", color = " + color);
        result = (number < 10) && (color == "red");
        System.out.print("result = (number < 10) && (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) & (color == "red");
        System.out.print("result = (number < 10) & (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) || (color == "red");
        System.out.print("result = (number < 10) || (color == \"red\") = ");
        System.out.println(result);
        // เปรียบเทียบค่า bit
        result = (number < 10) | (color == "red");
        System.out.print("result = (number < 10) | (color == \"red\") = ");
        System.out.println(result);
        result = (number < 10) ^ (color == "red");
        System.out.print("result = (number < 10) ^ (color == \"red\") = ");
        System.out.println(result);
        result = !(number < 10);
        System.out.print("result = !(number < 10) = ");
        System.out.println(result);
        result = !(color == "red");
        System.out.print("result = !(color < \"red\") = ");
        System.out.println(result);
        System.out.println(8 | 5);

    }
}
