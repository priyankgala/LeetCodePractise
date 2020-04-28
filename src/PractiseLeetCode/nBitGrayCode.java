package PractiseLeetCode;

/**
 *
 * @author kinja
 */
import java.util.*;

public class nBitGrayCode {

    public static List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> result = new ArrayList<Integer>();
            result.add(0);
            return result;
        }

        List<Integer> result = grayCode(n - 1);
        int numToAdd = 1 << (n - 1);

        for (int i = result.size() - 1; i >= 0; i--) { 
            result.add(numToAdd + result.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = grayCode(4);
//        Collections.reverse(a);
        for (int i = 0; i < a.size(); i++) { 
            String answer = Integer.toBinaryString(a.get(i));
            System.out.println(""+answer);
        }
    }
}
