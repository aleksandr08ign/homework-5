import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        byte[] numbers = new byte[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(fractionalNumbers[0]);
        System.out.println(fractionalNumbers[1]);
        System.out.println(fractionalNumbers[2]);
        int[] arbitrary = {3, 2, 36, 105};
        System.out.println(arbitrary[3]);
        System.out.println(arbitrary[0]);
        System.out.println(arbitrary[2]);
        System.out.println(arbitrary[1]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte[] numbers2 = new byte[3];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        System.out.println(Arrays.toString(numbers2));
        double[] fractionalNumbers2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(fractionalNumbers2));
        int[] arbitrary2 = {3, 2, 36, 105};
        System.out.println(Arrays.toString(arbitrary2));
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte[] numbers3 = new byte[3];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        for (int i = numbers3.length - 1; i > 0; i--) {
            System.out.print((numbers3[i]) + ", ");
        }
        System.out.print(numbers3[0]);
        System.out.println();

        double[] fractionalNumbers3 = {1.57, 7.654, 9.986};
        for (int a = fractionalNumbers3.length - 1; a > 0; a--) {
            System.out.print(fractionalNumbers3[a] + ", ");
        }
        System.out.print(fractionalNumbers3[0]);
        System.out.println();

        int[] arbitrary3 = {3, 2, 36, 105};
        for (int b = arbitrary3.length - 1; b > 0; b--) {
            System.out.print(arbitrary3[b] + ", ");
        }
        System.out.print(arbitrary3[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte[] number = new byte[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int c = 0; c <= 2; c++) {
            if ((number[c] % 2) == 0) {   // выводит только четные значения в массиве
                System.out.println(number[c]);
            } else {
                System.out.println(number[c] + 1);
            }
        }
    }
}