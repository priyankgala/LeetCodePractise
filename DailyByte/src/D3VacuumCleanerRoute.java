/*
This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, 
return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, 
representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
 */
public class D3VacuumCleanerRoute {

    public static void main(String args[]) {
        String str = "RUULLDRD";
        System.out.println("Returns to original position? "+returnToOGPOS(str));

    }

    private static Boolean returnToOGPOS(String str) {
        
        int i =0;
        int start=0;
        while(start < str.length()){
            if(str.charAt(start) == 'L' || str.charAt(start) == 'D' ){
                start++;
                i -= 1;
//                System.out.println(""+i);
//                System.out.println(""+str.charAt(start));
            }else if(str.charAt(start) == 'R' || str.charAt(start) == 'U' ){
                start++;
                i += 1;
//                System.out.println(""+str.charAt(start));
//                System.out.println(""+i);
            }
        }
        return (i==0);
    }

}
