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

        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        float[] secondArray = {1.57f, 7.654f, 9.986f};
        char[] thirdArray = new char[]{'a', 'b', 'c', 'd', 'e'};
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        float[] secondArray = {1.57f, 7.654f, 9.986f};
        char[] thirdArray = new char[]{'a', 'b', 'c', 'd', 'e'};

        for (int index = 0; index < firstArray.length; index++) {
            if (index == firstArray.length - 1) {
                System.out.println(firstArray[index]);
                break;
            }
            System.out.print(firstArray[index] + ", ");
        }

        for (int index = 0; index < secondArray.length; index++) {
            if (index == secondArray.length - 1) {
                System.out.println(secondArray[index]);
                break;
            }
            System.out.print(secondArray[index] + ", ");
        }

        for (int index = 0; index < thirdArray.length; index++) {
            if (index == thirdArray.length - 1) {
                System.out.println(thirdArray[index]);
                break;
            }
            System.out.print(thirdArray[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        float[] secondArray = {1.57f, 7.654f, 9.986f};
        char[] thirdArray = new char[]{'a', 'b', 'c', 'd', 'e'};

        for (int index = firstArray.length - 1; index >= 0; index--) {
            System.out.print(firstArray[index]);

            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int index = secondArray.length - 1; index >= 0; index--) {
            System.out.print(secondArray[index]);

            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int index = thirdArray.length - 1; index >= 0; index--) {
            System.out.print(thirdArray[index]);

            if (index != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] firstArray = new int[] {1, 2, 3};

        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] % 2 != 0) {
                firstArray[index]++;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}