
class Drink {
    String name;
    double pricePerLitre, ObjectWeight;
    // erikaal on kaal(kg) ala kohta(meetrit**3)

    public Drink(String nName, double price, double weight){
        this.name = nName;
        this.pricePerLitre = price;
        this.ObjectWeight = weight;
    }
    public void printDrinkInfo(){
        System.out.println("Drink name:  "+this.name);
        System.out.println("Price per litre:  "+this.pricePerLitre + " Euros/Litre(L)");
        System.out.println("Object special weight:  "+this.ObjectWeight + " kg/m(cubed)");
    }
    
}
