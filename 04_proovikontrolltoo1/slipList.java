import java.util.*;

public class slipList{
    List<Double> slipValues;
    List<Double> calcList;
    public slipList(List<Double> slipAverageList, List<Double> oldCalcList){
        slipValues = slipAverageList;
        calcList = oldCalcList;
    }

    public void addValue(double x){
        slipValues.add(x);
        for(int i=slipValues.size()-3; i<=slipValues.size();){
            System.out.println(slipValues.get(i));
            Double newVal = (slipValues.get(i) + slipValues.get(i+1) + slipValues.get(i+2))/3;
            calcList.add(newVal);
            System.out.println(newVal);
            System.out.println(calcList);
            break;
        }
    }
}