import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class LotteryGenerator {
    public static void main(String[] args){
        long repetition = 1;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        LotteryNumber myLotto = new LotteryNumber();
        LotteryNumber newNumber = new LotteryNumber();

        myLotto.PrintNumber("This is your lottery number: ");

        while(!myLotto.IsEqual(newNumber.firstFive, newNumber.powerball, 3)){
            newNumber = new LotteryNumber();
            repetition++;
        }
        newNumber.PrintNumber("This is the new number: ");

        myLotto.matching(newNumber.firstFive, newNumber.powerball);
        System.out.println("\nThe number of times before Winning: "+decimalFormat.format(repetition));
    }
}
