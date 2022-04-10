public class Torus {
    double radius, width;
    public nSideCuboid(double newL, double newW, double newH){
        radius = newL;
        width = newW;
        height = newH;
    }
    @Override
    public double botCircumference(){
        return Math.PI * radius;
    }
}
