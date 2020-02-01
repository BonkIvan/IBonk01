package by.belhard.J20.bonk.homework.homework01;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        int a, n, b, c;
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число: ");
        a = number.nextInt();
        Scanner p = new Scanner(System.in);
        System.out.print("Введите степень: ");
        n = p.nextInt();
        if (n < 0) {
            System.out.println("Степень должна быть положительной.");
        } else {
            c = a / a;
            for (; n > 0; n--) {
                b = c * a;
                c = b;
            }
            System.out.println("Результат - " + c);

        }
    }
}