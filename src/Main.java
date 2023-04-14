public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arraysInt = {1, 2, 3};
        double[] arraysDouble = {1.57, 7.654, 9.986};
        int[] arraysRandom = {4, 5, 6};
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        int[] arraysInt = {1, 2, 3};
        double[] arraysDouble = {1.57, 7.654, 9.986};
        int[] arraysRandom = {4, 5, 6};
        for (int i = 0; i < arraysInt.length; i++) {
            if (i == arraysInt.length - 1) {
                System.out.print(arraysInt[i]);
            } else {
                System.out.print(arraysInt[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arraysDouble.length; i++) {
            if (i == arraysInt.length - 1) {
                System.out.print(arraysDouble[i]);
            } else {
                System.out.print(arraysDouble[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arraysRandom.length; i++) {
            if (i == arraysInt.length - 1) {
                System.out.print(arraysRandom[i]);
            } else {
                System.out.print(arraysRandom[i] + ", ");
            }
        }
    }
}