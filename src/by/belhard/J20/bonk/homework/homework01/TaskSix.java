package by.belhard.J20.bonk.homework.homework01;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);
        System.out.print("На сколько лет делаем вклад: ");
        int x = years.nextInt();
        Scanner deposit = new Scanner(System.in);
        System.out.print("Сумма вклада: ");
        double y = deposit.nextDouble();
        double z, t;
        t = y * 0.01;
        for (; x > 0; x--) {
            z = y * 1.15 - t;
            y = z;
        }
        System.out.print("Ваш сумма составит: ");
        System.out.printf("%.2f", y);
    }

}

