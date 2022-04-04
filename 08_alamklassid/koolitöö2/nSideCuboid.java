public class nSideCuboid extends Kujund{
    double length, width;
    public nSideCuboid(double newL, double newW, double newH){
        length = newL;
        width = newW;
        height = newH;
    }
    @Override
    public double botCircumference(){
        return 2*(length+width);
    }
}