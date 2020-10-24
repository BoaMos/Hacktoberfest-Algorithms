package ExtraLongFatorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    static BigInteger extraLongFactorials(BigInteger n) {
        if (n.intValue() == 1 || n.intValue() == 0)
            return new BigInteger("1");

        return n.multiply(extraLongFactorials(new BigInteger(String.valueOf(n.intValue()-1))));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.print(extraLongFactorials(new BigInteger(String.valueOf(n))));

        scanner.close();
    }

}
