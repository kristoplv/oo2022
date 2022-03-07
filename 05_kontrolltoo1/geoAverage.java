import java.lang.Math;

public class geoAverage{

    public static Double geometricAverage(double[] numArray){
        double val = 1.0;
        for(int i=0; i<numArray.length; i++){
            val *= numArray[i];
        }
        double arrLength = numArray.length;
        double rootVal = Math.pow(val, 1/arrLength);
        return rootVal;
    }
    public static void main(String[] args){
        double x = 3.0;
        double y = 4.0;
        System.out.println("Ulesanne 1. Kahe arvu geomeetriline keskmine: "+Math.sqrt(x*y));
        double numArray[] = new double[5];
        numArray[0] = 100.0;
        numArray[1] = 150.0;
        numArray[2] = 210.0;
        numArray[3] = 188.0;
        numArray[4] = 30.5;
        System.out.println("Ulesanne 2. Geomeetrilne keskmine on: "
        +geometricAverage(numArray));
        fileGeoAverage payChange1 = new fileGeoAverage("palgamuutus.txt");
        System.out.println("Tekstifailis olevad väärtused: "+payChange1.readFileLines()); 
        payChange1.createPaychangefile();
    }
}