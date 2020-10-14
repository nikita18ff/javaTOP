package sample;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{5, 2, 3, 4, 1, 6, 8, 11, 45};
        int count = 0;
        int maxCount = 0;

        System.out.print("Массив: ");
        for (int i = 0; array.length > i; i++) {
            count++;
            if (array[i] > maxCount) {
                maxCount = array[i];
            }
            System.out.print("" + array[i]);
        }
        System.out.println();


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }


        Double sum = 0.0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }

        System.out.println("Кол-во элементов массива: " + count);
        System.out.println("Максимальный элемент в массиве: " + maxCount);
        System.out.print("Сортировка Bubble: ");

        for (int i = 0; array.length > i; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("Медиана: " + sum / array.length);

    }
}
