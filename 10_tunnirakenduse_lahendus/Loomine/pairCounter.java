import java.util.*;

public class pairCounter<T extends Comparable<T> > {
    Map<sameTypePairs<T>, Integer> counter = new TreeMap<>();
    T last = null;
    
    void addNew(T element){
        if(last !=null){
            sameTypePairs<T> newest = new sameTypePairs<>();
            newest.first = last;
            newest.second = element;
            if(counter.containsKey(newest)){
                counter.put(newest, counter.get(newest)+1);
            } else{
                counter.put(newest, 1);
            }
        }
        last = element;

    }

}
