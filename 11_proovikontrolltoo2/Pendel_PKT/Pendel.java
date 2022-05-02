import java.math.*;


class Pendel {
    double height;
    int teethAmount;

    public Pendel(double newHeight, int cogwheelTeeth){
        this.height = newHeight;
        this.teethAmount  =cogwheelTeeth;
    }
    public double OscillationPeriod(){
        return ((2 * Math.PI * Math.sqrt(this.height/9.8)));
    }

    public void tickPendant(boolean x){
        cogInt cogWheel = new Cog(teethAmount);
        while(x == true){
            
            try {
                Thread.sleep((long)OscillationPeriod()*1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("One full Oscillation!");
            cogWheel.extraTick();
        }
    }


}
