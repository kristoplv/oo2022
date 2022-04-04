class Punkt2D {
    double x,y,output;
    public Punkt2D(){
        this(0, 0);
    }

    public Punkt2D(double newX, double newY){
        x = newX;
        y = newY;
    }
    public double distanceFromZero(){
        output = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        return output;
    }
}
