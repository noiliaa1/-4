import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        int fieldWidth = Integer.toString(Math.abs(originalNumber)).length();

        System.out.printf("Відображення реверсу числа: %0" + fieldWidth + "d\n", reversedNumber);
        scanner.close();
    }
}
