import java.util.Scanner;


public class DNE_1250204_1250233 {

    public static Scanner input = new Scanner(System.in);
    // add all constance here

    public static void main(String[] args) {
        // a)
        String company = input.nextLine();
        int lines = input.nextInt();            //number of persons
        int columns = input.nextInt();          //number of days
        int [][] matrix = readMatrix(lines,columns);

        // b)
        printMatrix(matrix);

        // c)

        // d)
        System.out.printf(" Average of each person's mood: %n");
        moodAverageEachPerson(lines,columns,matrix);
        // e)

        // f)
    }

    public static void moodAverageEachPerson(int l,int c,int m[][])
    {
        
    }


    public static void printMatrix(int[][] matrix) {
        printMatrixHeader(matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("Person #%d :", i);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrixHeader(int days) {
        System.out.println("b) Mood (level/day(person)");

        //header
        System.out.printf("%-10s:", "day");
        for (int i = 0; i < days; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();

        // devider
        System.out.printf("%-10s|", "----------");
        for (int i = 0; i < days; i++) {
            System.out.printf("---|");
        }
        System.out.println();

    }

    public static int[][] readMatrix(int lines, int columns) {
        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < lines; i++) { // for-cycle for the lines
            for (int j = 0; j < columns; j++) { // for-cycle for the columns
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}

