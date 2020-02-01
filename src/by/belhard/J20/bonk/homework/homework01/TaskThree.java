package by.belhard.J20.bonk.homework.homework01;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        //через логику else if, в данном случае мне необходима только одна переменная t
        int t;
        //задаем значение t
        Scanner degrees = new Scanner(System.in);
        System.out.print("Какая температура на улице: ");
        t = degrees.nextInt();
        //Проверка условия
        if (t > 30) {
            System.out.println("Ходи голый.");

        } else if (t <= 30 && t > 20) {
            System.out.println("Можно ходить и в майке.");
        } else if (t <= 20 && t > 10) {
            System.out.println("Надеть кофту не помешает.");
        } else if (t <= 10 && t > 0) {
            System.out.println("Пора надевать куртку.");
        } else if (t <= 0 && t > -10) {
            System.out.println("Пуховик, настал твой час.");
        } else if (t <= -10) {
            System.out.println("Пора надеть шапку.");

        }
    }

}
//возможно лучше было делать через switch, но пока не разобрался как устаналвивать диапазоны на case