public class Punkt3D extends Punkt2D{
    double x,y,z;
    public Punkt3D(double newX, double newY, double newZ){
        x = newX;
        y = newY;
        z = newZ;
    }
    public double distanceFromZero(){
        double output = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
        return output;
    }
    
}
