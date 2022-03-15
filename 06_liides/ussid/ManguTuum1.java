
public class ManguTuum1 implements ManguTuum{
    int appleX, appleY, snekHeadX=0, snekHeadY=0;
    int dimX = 10, dimY = 10;
    char direction = 'r';
    public void left(){direction='l';};
    public void right(){direction='r';};
    public void up(){direction='u';};
    public void down(){direction='d';};
    public void step(){
        if(direction=='l'){snekHeadX--;}
        if(direction=='r'){snekHeadX++;}
        if(direction=='u'){snekHeadY++;}
        if(direction=='d'){snekHeadY--;}
    };
    public int[][] snekLocations(){
        return new int[][]{{snekHeadX, snekHeadY}};
    };
    public int[] appleLocation(){
        return new int[]{appleX, appleY};
    };
    public void randomAppleLocation(){
        appleX = (int)(dimX*Math.random());
        appleY = (int)(dimY*Math.random());
    };
    public Integer getApple(){
        int tester = 0;
        if(snekHeadX == appleX && snekHeadY == appleY){
            tester = 1;
        } else {
            tester = 0;
        }
        return tester;
    }
}
