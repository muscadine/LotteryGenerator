import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryNumber {
    public  ArrayList<Integer> firstFive;
    public  int powerball;

    LotteryNumber() {
        Random random = new Random();
        firstFive= new ArrayList<Integer>();
        int randomInteger = 0;

        while(firstFive.size() < 5){
            randomInteger = random.nextInt(69)+1;
            if (firstFive.contains(randomInteger))
                continue;
            else
                firstFive.add(randomInteger);
        }

        Collections.sort(firstFive);
        powerball = random.nextInt(25)+1;
    }

    public void PrintNumber(String x){
        System.out.print(x);
        for (int value: firstFive)
            System.out.print(value +"\t");
        System.out.print(powerball+"\n");
    }

    public boolean IsEqual(ArrayList<Integer> newNumbers, int pBall, int amountMatch) {
        int matchCount = 0;

        if (powerball == pBall)
            matchCount++;
        for(int value:firstFive) {
            if (newNumbers.contains(value))
                    matchCount++;
        }
        if (amountMatch<=matchCount)
            return true;
        else return false;
    }
    public void matching(ArrayList<Integer> newNumbers, int pBall) {
        System.out.print("These numbers matched: ");
        int counter=0;

        for(int value:firstFive) {
            if (newNumbers.contains(value)) {
                System.out.print(value + "\t");
                counter++;
            }
        }
        if (powerball == pBall)
            System.out.println(powerball+" \nYou have matched " + counter + " and the Powerball!");
        else System.out.println("\nYou have matched " + counter + "!");

    }
}
