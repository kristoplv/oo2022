import java.util.*;

public class Keskmine{
    public static double aritAverage(Double n1, Double n2, Double n3){
        return (n1+n2+n3)/3;
    }
    public static List<Double> slipAverage(List<Double> slip){
        List<Double> calculatedValues = new ArrayList<Double>(3);
        for(int i=0; i<slip.size()-2; i++){
            double value = (slip.get(i) + slip.get(i+1) + slip.get(i+2))/3;
            calculatedValues.add(value);
        }
        return calculatedValues;
    }
    public static Double addValLoop(){
        System.out.println("Lisa arv:");
        String val1 = System.console().readLine();
        Double val = Double.parseDouble(val1);
        return val;
        }


    public static void main(String[] args){
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
        System.out.println(aritAverage(num1, num2, num3));
        List<Double> slipAverageList = new ArrayList<Double>(5);
        slipAverageList.add(9.0);
        slipAverageList.add(13.0);
        slipAverageList.add(1.0);
        slipAverageList.add(19.0);
        slipAverageList.add(12.0);
        List<Double> oldCalcList = slipAverage(slipAverageList);
        slipList list1 = new slipList(slipAverageList, oldCalcList);
        while(true){
            System.out.println("lisame veel arve?[0][1]");
            int ans = Integer.parseInt(System.console().readLine());
            if(ans == 0){
                break;
            } else {
                list1.addValue(addValLoop());
            }
        }

    }

}