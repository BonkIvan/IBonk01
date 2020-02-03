package by.belhard.J20.bonk.lessons.lesson03;

public class QuadraArrayExample {
    public static void main(String[] args) {
        int[][] array = new int[3][];


        array[0] = new int[3];
        array[1] = new int[]{4, 5};
        array[2] = new int[1];

        byte[][] arrayBytes = {{1, 2, 3}, {4, 5, 6}};

        //

        int[][] mjultiTable = new int[8][8];

        for (int i = 2; i <= 9; i++)
            for (int j = 2; j <= 9; j++) {
                mjultiTable[i - 2][j - 2] = i * j;
            }

        for (int[] innerArray : mjultiTable) {

            for (int i : innerArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        String[] strArray = {"sp3o", "qwe", "rty", "uio",
        "asd"};

        String result = "";

        for (String s : strArray) {
            if(s.length()<=3)
                result += s;
        }

    }


}
