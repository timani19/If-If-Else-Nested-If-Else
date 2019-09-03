package decisionmakingstatemnts;


// If-else if-else demo

// first we give If condition and it has to be true
// Then we give else if condition (If the first condition is false, it will then come to else if- and this condition has to be true
// else - if the else, else if condition is false - then this else block will get executed

public class IfElse {
    public static void main(String[] args) {
        int passingscore, marksObtained;
        String name;

        passingscore = 40;
        marksObtained = 50;  // just change the value of marksObtained and see which one of codes gets executed
        name="Imani";

        if(marksObtained>passingscore && name=="Tiffany"){       // here we are giving two condition. It will check if marksObtained> passingscor, also if name is Tiffany
            System.out.println("You have passed the test");      // this is false cz name is not Tiffany, so this block will not execute
        }

        else if(marksObtained==passingscore){                   // this block is not true, so will not get executed
            System.out.println("Passed but need to improve");
        }

        else {
            System.out.println("You FAILED");                 // above condition are false- So this block will execute
        }


        }
    }
