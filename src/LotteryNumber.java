import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryNumber {
    public static ArrayList<Integer> firstFive;
    public static int powerball;

    LotteryNumber() {
        Random random = new Random();
        firstFive= new ArrayList<Integer>();
        int randomInteger = 0;

        while(firstFive.size() < 5){
            randomInteger = random.nextInt(68);
            if (firstFive.indexOf(randomInteger) == -1)
                firstFive.add(randomInteger+1);
        }

        Collections.sort(firstFive);
        powerball = random.nextInt(25);
    }

    LotteryNumber(int value){
        firstFive= new ArrayList<Integer>();

        while(firstFive.size() <5)
            firstFive.add(value);
        powerball=value;
    }

    public void PrintNumber(){
        System.out.print("This is your lottery number: ");
        for (int value: firstFive)
            System.out.print(value +"\t");
        System.out.print(powerball+"\n");
    }

    public boolean IsEqual(ArrayList<Integer> newNumbers, int pBall) {
        if(newNumbers.equals(firstFive) || pBall==powerball) return true;
        else
            return false;
    }
}
