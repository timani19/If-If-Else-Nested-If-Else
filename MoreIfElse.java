package decisionmakingstatemnts;

public class MoreIfElse {
    public static void main(String[] args) {

    int numberOfitems;
    int averagecost;
    int totalcost;

    numberOfitems=2;    // change the value of numberOfitems and see which block gets exectuted
    totalcost=250;      // change the value of total cost and see which block gets exectuted

        if(numberOfitems>0)            //nested if statement, condition within a condition
        if (totalcost>200){
        averagecost=totalcost/numberOfitems;
        System.out.println(averagecost);
    }

        else {
        System.out.println("No iteams were purchased");
    }


}

}