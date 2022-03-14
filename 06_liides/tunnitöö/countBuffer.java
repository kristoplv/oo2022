public class countBuffer implements Logija{
    Logija sihtLogija;
    int counter = 0;
    public countBuffer(Logija logija){
        sihtLogija=logija;
    }
    public void logi(String teade){
        sihtLogija.logi(teade);
        counter++;
    };

    public int countNumber(){return counter;}
}
