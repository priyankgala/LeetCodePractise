package HackerRandFolder;

   import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class BigSorting {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
            PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() > s2.length()) return 1;
                if(s1.length() < s2.length()) return -1;
                if(s1.length() == s2.length()){
                    for(int i = 0; i < s1.length(); i++){
                        if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
                        if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
                    }

                }
                return 0;
        }
            });

            for(String s: unsorted){
                queue.add(s);
            }

            int count=0;
            while(!queue.isEmpty()){
                unsorted[count] = queue.poll();
                count++;
            }
                
            return unsorted;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] unsorted = {"31415926535897932384626433832795", "1" , "3",  "10", "3", "5"};
        String[] result = bigSorting(unsorted);

        for(String s : result){
            System.out.println(""+s);
        }
    }
}