package by.belhard.J20.bonk.lessons.lesson02;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println("abc\ndef");
        byte b1;
        b1 = 127;
        byte b2 = 2;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        long ll = 2500000000L; // добавляем L в конце
        float f1 = 2.1f; // добавляем f в конце


        char c1 = 'a';
        char c2 = 99;
        System.out.println((int) c1);
        System.out.println(c2);
        System.out.println((char)('a' + 2));

        int a = 1;
        System.out.println(a++);
        System.out.println(++a);

        System.out.println(15/7.0);

        System.out.println(15!=15);
        boolean b = 15==15;
        System.out.println(b);

    }
}
