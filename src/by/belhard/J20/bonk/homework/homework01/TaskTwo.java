package by.belhard.J20.bonk.homework.homework01;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        double r, s, l, pi;//так как переменные все будут дробными
        pi = 3.14;
        Scanner radius = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        r = radius.nextDouble();

        //условия проверки через if
        if (r < 0) {
            System.out.println("Значение радиус должно быть положительным.");
        }

        // условия выполнения если значение переменной r подходит
        else {
            s = 2 * r * pi;
            l = pi * r;
            System.out.println("Площадь круга = " + s + "\n" + "Длинна окружности = " + l);
        }
    }
}
