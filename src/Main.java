import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Строки
        String str = "World";

        int length = str.length();

        System.out.println(length);

        char firstChar = str.charAt(0);

        System.out.println(firstChar);

        String s1 = "hello"; // == сравнивает ссылки, isEquals сравнивает значение
        String s2 = "hel";
        String s3 = "lo";
        String res = s2+s3;

        boolean isEqual = s1.equals(res);
        System.out.println(isEqual);
        */

        // Одномерные массивы
        System.out.println("Одномерные массивы");
        int[] numArray = {1, 2, 3, 4, 5};

        System.out.println("Первый вывод");
        for (int i : numArray) { // Только для вывода массивов
            System.out.println(i);
        }

        System.out.println("Второй вывод");
        for (int i = 0; i < numArray.length; i++) { // Стандартный вывод
            System.out.println(numArray[i]);

        }
        System.out.println("Array length " + numArray.length);

        // Двумерные массивы
        System.out.println("Двумерные массивы");
        int[][] numMatrix = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        System.out.println(numMatrix[2][0]);

        System.out.println("Первый вывод");
        for (int[] row : numMatrix) { // Вывод через вывод для массивов
            for (int j : row) {
                System.out.println(j);
            }
        }

        System.out.println("Второй вывод");
        for (int i = 0; i < numMatrix.length; i++) {
            for (int j = 0; j < numMatrix[i].length; j++) {
                System.out.println(numMatrix[i][j]);
            }
        }

    }
}