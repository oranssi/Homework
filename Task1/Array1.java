package Task1;

/**
 * Created by Viktor on 06.05.2018.
 */
public class Array1 {
    public static void main(String[] args) {
        int arrayOfInts1[] = {5, 10, 15};
        int arrayOfInts2[] = {6, 3, 8};

        int sumOfFirstArray = 0;
        int sumOfSecondArray = 0;


        for (int i : arrayOfInts1)
            sumOfFirstArray += i;

        System.out.println("Summary of first array is " + sumOfFirstArray);

        for (int i : arrayOfInts2)
            sumOfSecondArray += i;

        System.out.println("Summary of second array is " + sumOfSecondArray);

    }


}
