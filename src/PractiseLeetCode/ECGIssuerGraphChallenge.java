package PractiseLeetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ECGIssuerGraphChallenge {
    
   public static void main(String[] args) throws Exception{
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(r);
        
        ArrayList<String> lines = null; 
        
        while(in.readLine() != null && in.readLine().length() > 8){
            System.out.println("Length is: "+ in.readLine().length());
            String str = in.readLine();
            lines.add(str);
        }
       
        
        Map<String, String> parent = new HashMap<>();
        Map<String, String> child = new HashMap<>();
        Map<String, String> rating = new HashMap<>();
        
        for(String line: lines){
            String[] arr = line.replaceAll(" ", "").split("[\\|]");
            parent.put(arr[0], arr[1]);
            
            if(child.containsKey(arr[1])){
                child.put(arr[1], child.get(arr[1])+","+arr[0]);
            }else{
                child.put(arr[1], arr[0]);
            }
            
            rating.put(arr[0], arr[2]);
        }
        if(isCyclic(child)){
            System.out.println("Cyclic");
        }
        else{
            System.out.println("not Cyclic");
        } 
        
        System.out.println("Parent: "+parent);
        System.out.println("Child: "+child);
        
        String issuer = in.readLine().replaceAll(" ", "");
        System.out.println("Issuer"+issuer);
        System.out.println("Max profit "+find_max_rating(issuer, parent, rating));
   }

    private static boolean isCyclic(Map<String, String> child) {
        
        HashMap<String, String> roots = (HashMap<String, String>) child;
        ArrayList<String> visited = new ArrayList<>();
        for(Map.Entry<String,String> entry : roots.entrySet()){
            if(!traverse(entry.getKey(), visited, child)){
                return true;
            }
        }
        return false;
        
    }

    private static boolean traverse(String node, ArrayList<String> visited, Map<String, String> p) {
        String[] children = {};
        
        if(p.get(node) != null)
            children = p.get(node).split(",");
        
        for(String child: children){
            if(visited.contains(child)){
                return false;
            }else{
                visited.add(child);
                if(!traverse(child, visited, p)){
                    return false;
                }
                visited.remove(child);
            }
        }
        
        return true;
    }

    private static String find_max_rating(String issuer, Map<String, String> parent, Map<String, String> rating) {
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("C", 1);
        order.put("CC", 2);
        order.put("CCC", 3);
        order.put("B", 4);
        order.put("BB", 5);
        order.put("BBB", 6);
        order.put("A", 7);
        order.put("AA", 8);
        order.put("AAA", 9);
        
        int maxOrder = 0;
        
        if(order.get(rating.get(issuer))!= null){
            maxOrder = order.get(rating.get(issuer));
                    
        }
        String best = rating.get(issuer);
        
        while(issuer != null){
            
            if(order.get(rating.get(issuer)) != null && order.get(rating.get(issuer)) > maxOrder){
                maxOrder = order.get(rating.get(issuer));
                best = rating.get(issuer);
            }
            issuer = parent.get(issuer);
        }
        
        return best;
    }
}
