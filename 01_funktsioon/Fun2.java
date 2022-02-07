public class Fun2{
    public static Double[] reaalarvud(String[] sd){
        double[] val1 = new double[sd.length];
        for(int i=0; i<sd.length; i++){
            val1[i]=Double.parseDouble(sd[i]);
        }
        return val1;
    }
    public static Double cm (double inch){
        return inch * 2.54;
    }
    public static void main(String[] args){
        double[] arvud = reaalarvud(args);
        for(int i=0; i<arvud.length; i++){
            System.out.println(cm(arvud[i]));
        }
    }
}