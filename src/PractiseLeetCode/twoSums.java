package PractiseLeetCode;

import java.util.*;

public class twoSums {

    public static void main(String args[]) {
        int a[] = {1,2,3,4,13, 13, 5,6,7,8};
        int target = 15;

        int result[] = new int[a.length];

        result = twoSums(a, target);

        for (int n : result) {
            System.out.println("" + n);
        }

    }

    public static int[] twoSums(int[] a, int target) {

//        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(a);
        int answer[] = new int[2];
        Arrays.fill(answer, 0);
//        for (int i = 0; i < a.length; i++) {
//            if (map.containsKey(target - a[i])) {
//                int x = map.get(target-a[i]);
//                answer[0] = x;
//                answer[1] = i;                
//
//            } else {
//                map.put(a[i], i);
//            }
//        }
//        System.out.println("" + map);

        for (int i = 0; i < a.length; i++) {
            int low = i;
            int high = a.length - 1;

            while (low < high) {
                if(a[low] + a[high] == target){
                    answer[0] = low;
                    answer[1] = high;
                    break;
                }else if(a[low] + a[high] > target){
                    high --;
                }else
                    low++;
            }
        }

        return answer;

    }

}
