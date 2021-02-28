
public class D1ReverseString {

    public static void main(String args[]) {
//        String str = "Cat";
//        String str = "The Daily bYTE";
        String str = "This tale is old";
        StringBuilder s = new StringBuilder();
        s.append(str);
        s.reverse();
//        System.out.println("" + s);

//        System.out.println(reverseString(str));
        System.out.println("Using string builder: "+reverseString1(str));
    }

    private static String reverseString(String str) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        StringBuilder s = new StringBuilder();
        for (char c : str.toCharArray()) {
            s.insert(0, c);
        }
        System.out.println(s);
        return s.toString();
    }
    
    private static String reverseString1(String str) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
//        return new StringBuilder().append(str).reverse(str).toString();
//        StringBuilder s = new StringBuilder(str);
        
        return new StringBuilder(str).reverse().toString();
    }
}
