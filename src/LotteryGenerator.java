import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class LotteryGenerator {
    public static void main(String[] args){
        long repetition = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        LotteryNumber myLotto = new LotteryNumber(1);
        LotteryNumber newNumber = new LotteryNumber(2);

        myLotto.PrintNumber();
        newNumber.PrintNumber();

        Test firstTest = new Test(1);
        Test secondTest = new Test(2);
        firstTest.display();
        secondTest.display();

        /*while(myLotto.IsEqual(newNumber.firstFive, newNumber.powerball)){
            repetition++;
        }*/
        System.out.println("The number of times before Winning: "+decimalFormat.format(repetition));
    }
}
