public class ReverseString {

    public static void main(String args[]) {
//        String str = "Cat";
//        String str = "The Daily bYTE";
        String str = "CIVIC";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        StringBuilder s = new StringBuilder();
        for(char c: str.toCharArray()){
            s.insert(0, c);
        }
        System.out.println(s);
        return s.toString();
    }
}
