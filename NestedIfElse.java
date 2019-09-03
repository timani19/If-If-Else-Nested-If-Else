package decisionmakingstatemnts;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int passingMarks;
        int marksScored;
        char grade;

        passingMarks = 50;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score");
        marksScored = scanner.nextInt();
        // System.out.println("Enter your grade");
        // grade = scanner.next().charAt(0);

        if (marksScored > passingMarks) {         // nested if else- here we have multiple if else statment inside a IF statement
            if (marksScored > 90)
                grade ='A';
            else if (marksScored > 80)
                grade = 'B';
            else if (marksScored > 70)
                grade ='C';
            else
                grade = 'D';
            System.out.println("Your grade is : " + grade);
        }

        else {
            grade = 'F';
            System.out.println("You failed and your grade is " + grade);
        }

    }

}
