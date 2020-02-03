package by.belhard.J20.bonk.lessons.lesson03;

public class ArraysExample {

    public static void main(String[] args) {

        int [] array = new int [5];

      /*  array [0] = 1;
        array [1] = 12;
        array [2] = 41;
        array [3] = -11;
        array [4] = 100;*/
      for(int i=0; i<array.length; i++)
          array[i] = i*2;

        System.out.println(array[0]);
        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);

       String [] stringsArray = new String[] {"one", "two", "three", "four", "five", "six"};


       for (String s: stringsArray) {
           if(s.equals("three"))
               continue;
           System.out.println(s);

       }


    }

}
