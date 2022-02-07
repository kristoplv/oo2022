public class standartHalve{
    public static double[] reaal(String[] sd){
        double[] v = new double[sd.length];
        for(int i = 0; i<sd.length; i++){
            v[i] = Double.parseDouble(sd[i]);
        }
        return v;
    }
    public static double average(double[] av){
        double sum = 0;
        for(int i=0;i<av.length; i++){
            sum += av[i];
        }
        double average_val = sum / av.length;
        System.out.println(average_val);
        double sqrt_sum = 0;
        for(int i=0; i<av.length; i++){
            sqrt_sum += (av[i] - average_val)*(av[i]-average_val);
            System.out.println(sqrt_sum);
        }
        return Math.sqrt(sqrt_sum/av.length);
    }
    public static void main(String[] args){
        double[] arvud = reaal(args);
        System.out.println(average(arvud));

    }
}