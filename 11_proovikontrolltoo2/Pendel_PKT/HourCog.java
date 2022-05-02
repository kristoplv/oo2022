public class HourCog implements cogInt{
    int minutesInHour = 60;
    int tickCounter;
    int currentHour;
    public HourCog(){
        tickCounter = 0;
        currentHour = 0;
    }

    @Override
    public void extraTick() {
        tickCounter++;
        if(tickCounter==minutesInHour){
            System.out.println("One hour has passed!");
            tickCounter = 0;
            currentHour++;
            System.out.println(minutesInHour - tickCounter +" minutes till full hour!");
            if(currentHour>23){
                currentHour = 0;
            }
        }else{
            System.out.println(minutesInHour - tickCounter +" minutes till full hour!");
        }
        
    }

}
