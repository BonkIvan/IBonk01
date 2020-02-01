package by.belhard.J20.bonk.homework.homework01;

public class TaskFour {
    public static void main(String[] args) {
        double salary1, salary2, salary3, max, min, s, t, r;
        salary1 = 20.5;
        salary2 = 15.2;
        salary3 = 21.6;
        //Решение 1
        if (salary1 > salary2 && salary2 > salary3 && salary1 > salary3) {
            max = salary1;
            min = salary3;
            System.out.println(max - min);
        } else if (salary2 > salary1 && salary1 > salary3 && salary2 > salary3) {
            max = salary2;
            min = salary3;
            System.out.println(max - min);
        } else if (salary3 > salary1 && salary1 > salary2 && salary3 > salary2) {
            max = salary3;
            min = salary2;
            System.out.println(max - min);
        } else if (salary1 > salary2 && salary3 > salary2 && salary1 > salary3) {
            max = salary1;
            min = salary2;
            System.out.println(max - min);
        } else if (salary2 > salary1 && salary3 > salary1 && salary2 > salary3) {
            max = salary2;
            min = salary1;
            System.out.println(max - min);
        } else if (salary3 > salary1 && salary2 > salary1 && salary3 > salary2) {
            max = salary3;
            min = salary1;
            System.out.println(max - min);
        }
        // Решение 2

        s = (salary1 > salary2 && salary2 > salary3 && salary1 > salary3 ? salary1 - salary3 : salary1 - salary2);
        t = (salary2 > salary1 && salary1 > salary3 && salary2 > salary3 ? salary2 - salary3 : salary2 - salary1);
        r = (salary3 > salary2 && salary2 > salary1 && salary3 > salary1 ? salary3 - salary1 : salary3 - salary2);
        if (s > t && s > r) {
            System.out.println(s);
        } else if (t > s && t > r) {
            System.out.println(t);
        } else if (r > t && r > s) {
            System.out.println(r);
        }


    }
}