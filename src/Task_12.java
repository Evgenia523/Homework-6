public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Задание: 12");
        int[] array = {1, 2, 3, 2, 1}; // Инициализация массива

        boolean isSymmetric = true; // Флаг для проверки симметричности

        // Проверка симметричности массива
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isSymmetric = false;
                break;
            }
        }

        // Вывод результата
        if (isSymmetric) {
            System.out.println("Yes"); // Симметричный массив
        } else {
            System.out.println("No"); // Несимметричный массив
        }

    }
}
