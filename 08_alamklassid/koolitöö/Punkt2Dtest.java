import java.util.*;

public class Punkt2Dtest {
    public static void main(String[] args){
        List<Double> arrayOutput = new ArrayList<>();
        double[][] valuesForTest = {{2.0, 3.0}, {1.0, 1.0}, {5.0, 4.0}};
        double hightestNumber=0;
        for(int i=0; i< 3; i++){
            Punkt2D test = new Punkt2D(valuesForTest[i][0], valuesForTest[i][1]);
            System.out.println("Kaugus nullist on "+test.distanceFromZero());
            arrayOutput.add(test.distanceFromZero());
        }
        System.out.println("Suurim kaugus nullist massivis on: "+Collections.max(arrayOutput));

    }
}
