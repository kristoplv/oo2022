public class fourGrades extends controlTest{
    int x, y, z, f;
    public fourGrades(int newX, int newY, int newZ, int newF, int newThresh){
        x = newX;
        y = newY;
        z = newZ;
        f = newF;
        threshold = newThresh;
    }
    public double calcPercent (){
        return ((x+y+z+f)*100)/threshold;
    }
}
