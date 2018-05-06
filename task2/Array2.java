package task2;

/**
 * Created by Viktor on 06.05.2018.
 */
public class Array2 {
    public static void main(String[] args) {
        double arrayOfDoubles[][] = new double[3][3];

        arrayOfDoubles[0][0] = 1.0;
        arrayOfDoubles[0][1] = 1.5;
        arrayOfDoubles[0][2] = 2.0;
        arrayOfDoubles[1][0] = 1.5;
        arrayOfDoubles[1][1] = 2.0;
        arrayOfDoubles[1][2] = 2.5;
        arrayOfDoubles[2][0] = 2.0;
        arrayOfDoubles[2][1] = 2.5;
        arrayOfDoubles[2][2] = 3.0;

        System.out.println(arrayOfDoubles[0][0] + " "+arrayOfDoubles[0][1]+" "+arrayOfDoubles[0][2]);
        System.out.println(arrayOfDoubles[1][0] + " "+arrayOfDoubles[1][1]+" "+arrayOfDoubles[1][2]);
        System.out.println(arrayOfDoubles[2][0] + " "+arrayOfDoubles[2][1]+" "+arrayOfDoubles[2][2]);

        double diagonalSum1 = arrayOfDoubles[0][0] + arrayOfDoubles[1][1] + arrayOfDoubles[2][2];
        double diagonalSum2 = arrayOfDoubles[2][0] + arrayOfDoubles[1][1] + arrayOfDoubles[0][2];

        System.out.println("Summary of Diagonal1 is: " + diagonalSum1);
        System.out.println("Symmary of Diagonal2 is: " + diagonalSum2);

        double middleMultiplication = arrayOfDoubles[0][1]*arrayOfDoubles[1][1]* arrayOfDoubles[2][1];

        System.out.println("Results of middle rows multiplication is: "+ middleMultiplication);

        double sumOfEdges = arrayOfDoubles[0][0]+ arrayOfDoubles[2][0]+ arrayOfDoubles[0][2] + arrayOfDoubles[2][2];

        System.out.println("Result of edges summary is: "+ sumOfEdges);

    }
}
