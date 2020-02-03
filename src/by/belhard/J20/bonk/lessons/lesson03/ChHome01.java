package by.belhard.J20.bonk.lessons.lesson03;

public class ChHome01 {
    public static void main(String[] args) {

        int q = 4;
        String result;

        switch (q) {
            case 1:
                result = "Man";
                break;
            case 2:
                result = "Tue";
                break;
            case 3:
                result = "Wed";
                break;
            case 4:
                result = "Thu";
                break;
            case 5:
                result = "Fry";
                break;
            case 6:
                result = "Weekend";
                break;
            case 7:
                result = "Weekend";
                break;
            default:
                result = "bad input";
                break;
        }
        System.out.println(result);

    }
}
