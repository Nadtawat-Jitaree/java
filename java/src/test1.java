public class test1 {
    public static void main(String[] args) {
        int array1[][] = { { 7, 6, 8, 9 }, { 5, 6, 7, 8 }, { 10, 22, 33, 22 } };
        int maximum = 0;
        int minimum = 0;
        int total = 0;
        int num = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int x = 0; x < array1[i].length; x++) {
                num += 1;
                total += array1[i][x];
                if (array1[i][x] > maximum) {
                    maximum = array1[i][x];
                }
                if (x == 0 && i == 0) {
                    minimum = array1[i][x];
                }
                if (array1[i][x] < minimum) {
                    minimum = array1[i][x];
                }
            }
        }

        System.out.println("min is " + minimum);
        System.out.println("max is " + maximum);
        System.out.println("total is " + total);
        System.out.println("total num is " + num);
        System.out.println("average is " + total / num);
    }
}