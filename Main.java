import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Give me score for 1 student: ");
        int a = scan.nextInt();
        System.out.print("Give me score for 2 student: ");
        int b = scan.nextInt();
        System.out.print("Give me score of 3 student: ");
        int v = scan.nextInt();
        System.out.print("Give me score of 4 student: ");
        int d = scan.nextInt();
        double g = (a + b + v+ d) / 4.0;
        double[] grade=new double[4];
        int countExcellent = 0;
        int countGood = 0;
        int countSatisfactory = 0;
        int countBad = 0;


        if (a >= 90 && a <= 100) {
            countExcellent++;
        } else if (a >= 70 && a <= 89) {
            countGood++;
        } else if (a >= 50 && a <= 70) {
            countSatisfactory++;
        } else if (a >= 0 && a <= 59) {
            countBad++;
        }

        if (b >= 90 && b <= 100) {
            countExcellent++;
        } else if (b >= 70 && b <= 89) {
            countGood++;
        } else if (b >= 50 && b <= 70) {
            countSatisfactory++;
        } else if (b >= 0 && b <= 59) {
            countBad++;
        }

        if (v >= 90 && v <= 100) {
            countExcellent++;
        } else if (v >= 70 && v <= 89) {
            countGood++;
        } else if (v >= 50 && v <= 70) {
            countSatisfactory++;
        } else if (v >= 0 && v <= 59) {
            countBad++;
        }

        if (d >= 90 && d <= 100) {
            countExcellent++;
        } else if (d >= 70 && d <= 89) {
            countGood++;
        } else if (d >= 50 && d <= 70) {
            countSatisfactory++;
        } else if (d >= 0 && d <= 59) {
            countBad++;
        }



        System.out.println("Average ball of students: " + g);
        System.out.println("Excellent: " + countExcellent);
        System.out.println("Good: " + countGood);
        System.out.println("Satisfactory: " + countSatisfactory);
        System.out.println("Bad: " + countBad);


    }
}








