import java.util.ArrayList;

class Barrel {
    double volume;
    double litresOfDrink;
    double weightOfDrink;
    double litrePrice;
    ArrayList<Bottle> bottleAmount = new ArrayList<Bottle>();
    
    public Barrel(double vol, double litres){
        this.volume = vol;
        this.litresOfDrink = litres;
    }

    public Integer fillBottles(double a){
        return ((int)(litresOfDrink / a));
    }
    public void fillBarrelwithDrink(Drink a){
        this.weightOfDrink = a.ObjectWeight;
        this.litrePrice = a.pricePerLitre;
    }
    public void fillBottleWithDrink(Bottle a){
        if(!a.hasDrink){
            a.hasDrink = true;
            a.drinkWeight = this.weightOfDrink;
            a.LitrePrice = this.litrePrice;
            this.litresOfDrink = this.litresOfDrink - a.volume;
            System.out.println("Filled 1 bottle: Drink remaining:" +this.litresOfDrink);
        } else {
            System.out.println("Pudel juba täidetud joogiga!");
        }
    }
    public ArrayList<Bottle> emptyBarrelToBottles(Bottle a){
        double initAmount = fillBottles(a.volume);
        for(int i=0; i<initAmount;i++){
            Bottle b = new Bottle(a.volume, a.mass, a.recycleReward, a.bottleType);
            fillBottleWithDrink(b);
            bottleAmount.add(b);
        }
        return bottleAmount;
    }
}
