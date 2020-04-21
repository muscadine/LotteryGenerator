import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;


public class LotteryGenerator {
    public static void main(String[] args){
        Instant start = Instant.now();

        long repetition = 1;
        int amountMatch = 5;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        LotteryNumber myLotto = new LotteryNumber();
        LotteryNumber newNumber = new LotteryNumber();

        myLotto.PrintNumber("This is your lottery number: ");

        while(!myLotto.IsEqual(newNumber.firstFive, newNumber.powerball, amountMatch)){
            newNumber = new LotteryNumber();
            repetition++;
        }
        newNumber.PrintNumber("This is the new number: ");

        myLotto.matching(newNumber.firstFive, newNumber.powerball);
        System.out.println("\nThe number of times before Winning: "+decimalFormat.format(repetition));

        Instant finish = Instant.now();
        long timeElapsed = (amountMatch <6 ) ? Duration.between(start, finish).toMillis() : Duration.between(start, finish).getSeconds();

        if (amountMatch <6) System.out.println("The time it takes to run is "+timeElapsed+" Millisecond");
        else System.out.println("The time it takes to run is "+timeElapsed+" seconds");
    }
}
