public class Proov2 {
    public static void main(String[] args){
        Logija teine = new newLog();
        Logija esimene = new textLogger("tulemused.txt");
        hargnevLogija yhendaja = new hargnevLogija();
        yhendaja.lisaLogija(teine);
        yhendaja.lisaLogija(esimene);
        Logija proov = yhendaja;
        proov.logi("start");
        if(args.length==2){
            Integer value = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
            proov.logi(Integer.toString(value));
        }
        proov.logi("end");
    }
}
