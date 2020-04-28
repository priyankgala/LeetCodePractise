package PractiseLeetCode;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class HuffmanNode {

    int data;
    char c;

    HuffmanNode left;
    HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {

    public int compare(HuffmanNode x, HuffmanNode y) {

        return x.data - y.data;
    }
}

public class HuffmanEncodingProblem {

    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
        int n = 8;
        String s = "this was hard quiz for students";
//        HashMap<Character, Integer> map = new HashMap();
//        for (char c : s.toCharArray()) {
//            if (map.containsKey(c)) {
//                int count = map.get(c);
//                count++;
//                map.put(c, count);
//            } else {
//                map.put(c, 1);
//            }   
//        }
//        int count =0;
//        for (Map.Entry mapElement : map.entrySet()) { 
//            ++count;    
//            Character key = (Character)mapElement.getKey(); 
//            int value =(int)mapElement.getValue(); 
//  
//            System.out.print("'"+key+"',"); 
//              charArray[count] = key;
//              charfreq[count] = value;
//        }
//        System.out.println("");
//        for (Map.Entry mapElement : map.entrySet()) { 
//            Character key = (Character)mapElement.getKey(); 
//            int value =(int)mapElement.getValue(); 
//  
//            System.out.print(value + ","); 
//        }
//        
        
        
        char[] charArray = {'x','a','d','e','f','h','i','n','o','q','r','s','t','u','w','z'};
        int[] charfreq = {5,2,2,1,1,2,2,1,1,1,2,4,3,2,1,1};
        
        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());

        for (int i = 0; i < charArray.length; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }
        HuffmanNode root = null;
        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();
            HuffmanNode y = q.peek();
            q.poll();
            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }
        printCode(root, "");
    }
}
