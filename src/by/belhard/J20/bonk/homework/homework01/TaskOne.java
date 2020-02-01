package by.belhard.J20.bonk.homework.homework01;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int x, y, z;
        x = 200;// x и z  задают диапазон из которого выбираются простые числа
        z = 300;
        for (; x <= z; x++) {
            boolean prime = true;
            for (y = 2; y < x; y++) {
                if (x % y == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(x + " ");
            }
        }
    }
}
