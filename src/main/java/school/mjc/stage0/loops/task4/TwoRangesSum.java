package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip>lastInRow){
            System.out.println("number to skip is bigger then the last");
        } else if(lastInRow<0){
            System.out.println("last number in row is negative");
        } else {
            int countedSum = 0;
            int skippedSum = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if(i==numberToSkip){
                    skippedSum += i;
                } else{
                    countedSum += i;
                }
            }
            System.out.println("skipped sum is number " + skippedSum);
            System.out.println("counted sum is number " + countedSum);
        }

    }

    public static void main(String[] args) {
        TwoRangesSum a = new TwoRangesSum();
        a.printSumOfTwoRanges(1,1);
    }
}
