import java.lang.*;
import java.util.*;
import java.math.*;

public class Proov2 {
    public static void main(String[] args) {
        HashMap<Integer, String> guards =new HashMap<>();
        guards.put(1, "juku");
        guards.put(2, "Kati");
        System.out.println(guards);
        
        String[] names = {"juku", "kati", "Pablo", "pedro", "Juan", "Hose"};
        HashMap<String, Double> mathScores = new HashMap<>();
        for(int i = 0; i<names.length; i++){
            mathScores.put(names[i], Math.random()*100);
        }
        System.out.println(mathScores.keySet());
    }
}
