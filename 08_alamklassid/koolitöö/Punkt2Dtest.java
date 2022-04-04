import java.util.*;

public class Punkt2Dtest {
    public static void main(String[] args){
        List<Double> arrayOutput = new ArrayList<>();
        double[][] valuesForTest = {{5.0, 3.0, 1.0}, {2.0, 3.0}, {1.0, 1.0}, {5.0, 4.0}, {5.0, 5.0, 3.0}};
        double hightestNumber=0;
        for(int i=0; i< valuesForTest.length; i++){
            if(valuesForTest[i].length<3){
                Punkt2D test = new Punkt2D(valuesForTest[i][0], valuesForTest[i][1]);
                System.out.println("Kaugus nullist on "+test.distanceFromZero());
                arrayOutput.add(test.distanceFromZero());
            } else if(valuesForTest[i].length>2){
                Punkt2D test = new Punkt3D(valuesForTest[i][0], valuesForTest[i][1], valuesForTest[i][2]);
                System.out.println("Kaugus nullist on "+((Punkt3D)test).distanceFromZero());
                arrayOutput.add(((Punkt3D)test).distanceFromZero());
            }
        }
        System.out.println("Suurim kaugus nullist massivis on: "+Collections.max(arrayOutput));

    }
}
