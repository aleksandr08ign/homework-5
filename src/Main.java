public class Main {
    public static void main(String[] args) {

        task1();
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
}