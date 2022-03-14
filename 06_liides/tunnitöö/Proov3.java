public class Proov3 {
    public static void main(String[] args){
        Logija esimene = new textLogger("tulemused.txt");
        countBuffer counter = new countBuffer(esimene);
        Logija proov = counter;
        proov.logi("start");
        if(args.length==2){
            Integer value = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
            proov.logi(Integer.toString(value));
        }
        proov.logi("end");
        System.out.println(counter.countNumber());
    }
}
