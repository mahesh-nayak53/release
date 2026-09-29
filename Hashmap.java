
import java.util.HashMap;

public class Hashmap{
    public static void main(String[] args) {
        String str = "aaabbccdd";
        HashMap<Character, Integer> h = new HashMap<>();

        for(char x : str.toCharArray()){
            h.put(x, h.getOrDefault(x, 0)+1);
        }
        
        System.out.print(h);
    }
}