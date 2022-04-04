import java.math.*;


public class nSideTetrahedron extends Kujund{
    double length, width;
    public nSideTetrahedron(double newL, double newW, double newH){
        length = newL;
        width = newW;
        height = newH;
    }
    @Override
    public double botCircumference(){
        return 2*(length + width);
    }
    @Override
    public double sideArea(){
        return (botCircumference() *(Math.sqrt((length/2)*(length/2) +height*height)))/2; 
    }
}