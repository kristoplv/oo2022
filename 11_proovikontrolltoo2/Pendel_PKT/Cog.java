class Cog implements cogInt{
    int teeth = 0;
    int teethCount;
    cogInt hour;

    public Cog(int toothAmount){
        if(toothAmount>0){
            this.teeth = toothAmount;
        } else{
            this.teeth = 4;
        }
        this.hour = new HourCog();
    }
    public void extraTick(){
        teethCount++;
        if(teethCount == teeth){
            hour.extraTick();
            System.out.println("One minute has passed!");
            teethCount = 0;
            System.out.println(teeth-teethCount +" seconds remaining");
        } else{
            System.out.println(teeth - teethCount +" ticks remaining till full minute");
        }
    }
}
