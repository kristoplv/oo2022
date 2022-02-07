public class Fun1 {
    public static double inch (double sentimeeter) {
        return sentimeeter/2.54;
    }
  public static double cm (double inch) {
        return inch * 2.54;
    }
    public static void main(String[] args){
        if(args.length >0){
            double c= Double.parseDouble(args[0]);
            double t= Double.parseDouble(args[0]);
            System.out.println(inch(t));
            System.out.println(cm(c));
        }
    }
}
