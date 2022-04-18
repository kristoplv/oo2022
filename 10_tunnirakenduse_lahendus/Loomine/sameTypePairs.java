import java.util.*;

public class sameTypePairs<T extends Comparable<T> > implements Comparable<sameTypePairs<T>> {
    T first, second;

    @Override
    public int compareTo(sameTypePairs<T> canCompare){
        int dif1 = first.compareTo(canCompare.first);
        if(dif1 !=0){return dif1;}
        return second.compareTo(canCompare.second);

    }

    public String toString(){
        return "("+first+" ; "+second+") ";
    }
    
}
