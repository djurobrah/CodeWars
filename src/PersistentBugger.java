import java.util.ArrayList;

public class PersistentBugger {

    public static int persistence(long n) {
        long number = n;
        int counter = 0;
        while(number / 10 > 0)
        {
            number = multiplyMembers(number);
            System.out.println("Number is: " + number);
            counter++;
        }
        return counter;
    }

    public static long multiplyMembers(long n)
    {
        long sum = 1;
        String[] arrayStrings = String.valueOf(n).split("");
        for (String number: arrayStrings) {
            sum *= Long.parseLong(number);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(persistence(999));
    }
}
