import java.util.*;

public class hargnevLogija implements Logija{
    List<Logija> buffer = new ArrayList<Logija>();
    public void lisaLogija(Logija l){
        buffer.add(l);
    }
    public void logi(String teade){
        for(Logija abi: buffer){
            abi.logi(teade);
        }
    };
}
