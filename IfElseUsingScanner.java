package decisionmakingstatemnts;

import java.util.Scanner;


// IfElse statement using scanner Object

public class IfElseUsingScanner {
    public static void main(String[] args) {
        double score;
        char grade;

        // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.

        Scanner sc = new Scanner(System.in);   // sc is the object name we gave, can be anything
        System.out.println("Enter your score");
        score = sc.nextDouble();   // using .nextDouble since score is double data type

        System.out.println("Enter your grade");
        grade = sc.next().charAt(0);  // to read char value we have to define it this way

        if (score >= 90) {
            if (grade =='A');
            System.out.println("Outstanding result");
        }
        else if (score >= 80) {
            grade='A';
                System.out.println("Excellent Result");
            }
        else if (score >= 70) {
                grade = 'B';
                System.out.println("Average Result");
            }
        else if (score >= 60) {
                grade = 'C';
                System.out.println("Not bad");
            }
        else
            {
                System.out.println("Need Improvement");

            }

    }

}
