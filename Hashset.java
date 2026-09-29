import  java.util.*;
public class Hashset {
    public static void main(String[] args) {
        String str = "aabbccddee";
        
        HashSet<Character> h = new HashSet<>();

        for(char x : str.toCharArray()){
            h.add(x);
        }
        System.out.println("it will store unique values ");
        System.out.println(h);;
    }
}
