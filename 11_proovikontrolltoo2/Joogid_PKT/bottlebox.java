import java.util.ArrayList;

class bottlebox {
    String boxType;
    double boxcapacity;
    double boxWeight;
    double boxPrice;
    boolean isfilled;
    ArrayList<Bottle> boxBottles = new ArrayList<Bottle>();
    double filledBoxPrice;

    public bottlebox(String type, double cap, double weight, double price){
        this.boxType = type;
        this.boxcapacity = cap;
        this.boxWeight = weight;
        this.boxPrice = price;
    }

    public void fillBox(ArrayList<Bottle> bottleArray){
        int holdInitsize = bottleArray.size();
        for(int i=0; i<holdInitsize; i++){
            if(i>boxcapacity-1){
                this.isfilled = true;
                break;
            } else {
                boxBottles.add(bottleArray.get(i));
                bottleArray.remove(i);
            }
        }
        System.out.println("Pudelid pandud kasti!");
        System.out.println("Pudeleid alles: "+bottleArray.size());
        if(this.isfilled){
            System.out.println("Kast täis!");
        }
        this.filledBoxPrice = ((boxBottles.get(1).getPriceWithDrink()+boxBottles.get(1).recycleReward)*boxBottles.size()) + this.boxPrice;
    
        System.out.println("Kasti hind on: "+this.filledBoxPrice +" Eurot");
    }
}
