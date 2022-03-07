import java.util.*;
import java.lang.Math;

public class kolmnurk{
    public static void addPair(List<Double>x_coordinates,List<Double> y_coordinates){
        System.out.println("lisa x koordinaat:");
        Double newX = Double.parseDouble(System.console().readLine());
        System.out.println("lisa y koordinaat:");
        Double newY = Double.parseDouble(System.console().readLine());
        x_coordinates.add(newX);
        y_coordinates.add(newY);


    }
    public static Double getCircumference(List<Double>x_coordinates,List<Double> y_coordinates){
        Double circ = 0.0;
        for(int i=0; i<x_coordinates.size(); i++){
            if((x_coordinates.size()-1) - i == 0){
                System.out.println(i);
                System.out.println(i-i);
                double kaatet1 = Math.pow(x_coordinates.get(i) - x_coordinates.get(i-i), 2);
                double kaatet2 = Math.pow(y_coordinates.get(i) - y_coordinates.get(i-i), 2);
                double tous = kaatet2 / kaatet1;
                double eelmineTous = Math.pow(y_coordinates.get(i-2) - y_coordinates.get(i-1), 2) / Math.pow(x_coordinates.get(i-2) - x_coordinates.get(i-1), 2);
                System.out.println(tous);
                System.out.println(eelmineTous);
                if(tous < 0){
                    tous = tous * (-1);
                }
                if(eelmineTous < 0){
                    eelmineTous = eelmineTous *(-1);
                }
                if(tous < eelmineTous){
                    System.out.println("Toimus vektorite lõikumine viimase sirgega!");
                } else {
                    System.out.println("Ei toimunud lõikumist");
                }
                
                circ += Math.sqrt(kaatet1+kaatet2);
                System.out.println(circ);
            } else {
                double kaatet1 = Math.pow(x_coordinates.get(i) - x_coordinates.get(i+1), 2);
                double kaatet2 = Math.pow(y_coordinates.get(i) - y_coordinates.get(i+1), 2);

                
                circ += Math.sqrt(kaatet1+kaatet2);
                System.out.println(circ);
            }
        }
        return circ;
    }

    public static void main(String[] args){
        List<Double> x_coordinates = new ArrayList<Double>();
        List<Double> y_coordinates = new ArrayList<Double>();
        x_coordinates.add(0.0);
        x_coordinates.add(5.0);
        x_coordinates.add(10.0);

        y_coordinates.add(0.0);
        y_coordinates.add(3.0);
        y_coordinates.add(0.0);
        System.out.println(x_coordinates);
        System.out.println(y_coordinates);
        System.out.println("Kolmnurga ümbermõõt on: "+getCircumference(x_coordinates, y_coordinates));

        while(true){
            System.out.println("Lisame veel arve?[0][1]");
            Integer ans = Integer.parseInt(System.console().readLine());
            if(ans==0){
                break;
            } else{
                addPair(x_coordinates, y_coordinates);
            }
        }
        System.out.println("Hulknurga uus ümbermõõt on: "+getCircumference(x_coordinates, y_coordinates));
    }
}