class controlTest {
    int x, y, z;
    int threshold;
    public controlTest(){
        this(0, 0, 0, 0);
    }

    public controlTest(int newX, int newY, int newZ, int newThresh){
        x= newX;
        y = newY;
        z= newZ;
        threshold = newThresh;
    }
    public double calcPercent (){
        return ((x+y+z)*100)/threshold;
    }
}