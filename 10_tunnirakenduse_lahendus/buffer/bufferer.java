import java.util.*;

public class bufferer<I, O> implements Arvutaja<I, O>{
    Arvutaja<I, O> helper;
    Map<I, O> buffer = new HashMap<I, O>();
    public bufferer(Arvutaja a){
        helper = a;
    }
    public O f(I newInput){
        if(!buffer.containsKey(newInput)){
            buffer.put(newInput, helper.f(newInput));
        }
        return buffer.get(newInput);
    }
    
}
