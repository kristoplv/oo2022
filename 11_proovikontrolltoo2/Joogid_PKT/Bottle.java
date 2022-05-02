public class Bottle {
    double volume, mass, recycleReward;
    double drinkWeight, LitrePrice; //maht liitrites, mass per kg, taara eurodes
    String bottleType; // Plastik, klaas, plekk
    boolean hasDrink;
    boolean hasBox;
    String boxName;

    public Bottle(double nVolume, double nMass, double recycle, String type){
        this.volume = nVolume;
        this.mass = nMass;
        this.recycleReward = recycle;
        this.bottleType = type;
    }

    public double getWeightWithDrink(){
        return (drinkWeight*10*volume)+(mass*1000);
    }
    public double getPriceWithDrink(){
        return LitrePrice*volume;
    }
    public void addDrink(Drink a){
        this.hasDrink = true;
        this.drinkWeight = a.ObjectWeight;
        this.LitrePrice = a.pricePerLitre;
    }

    public void printBottleInfo(){
        System.out.println("Volume:  "+this.volume +" Litres(L)");
        System.out.println("Mass:  "+this.volume +" Grams(g)");
        System.out.println("Reward for recycle:  "+this.recycleReward+" Euros");
        System.out.println("Bottle type:  "+this.bottleType);
        if(hasDrink){
            System.out.println("Weight with drink:  ~"+getWeightWithDrink()+" Grams(g)");
            System.out.println("Price of bottle:  ~"+getPriceWithDrink()+" + "+ this.recycleReward+" Euros");
        } else {System.out.println("Weight with drink:  Has no drink");}

    }
}
