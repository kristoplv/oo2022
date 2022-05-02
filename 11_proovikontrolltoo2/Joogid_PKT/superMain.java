public class superMain {
    public static void main(String[] args) {
        //Uus jook ja pudel
        Drink cola = new Drink("Coca-Cola", 2.0, 103); //Nimi, hind per litre, tihedus/m**3
        Bottle Can1 = new Bottle(0.33, 0.0147, 0.1, "Can");
       
        Can1.addDrink(cola);
        Can1.printBottleInfo();
        cola.printDrinkInfo();


        Bottle can2 = new Bottle(1.0, 0.0322, 0.1, "Plastic");
        can2.printBottleInfo();
        
        Bottle can3 = new Bottle(1.0, 0.0322, 0.1, "Plastic");
        can3.addDrink(cola);
        can3.printBottleInfo();
        cola.printDrinkInfo();

        Barrel cokeBarrel = new Barrel(0.2, 100);//Ruumala m**3, liitrid
        cokeBarrel.fillBarrelwithDrink(cola);
        
        /*cokeBarrel.fillBottleWithDrink(can2);
        cokeBarrel.fillBottleWithDrink(can2);
        cokeBarrel.fillBottles(can2.volume);*/

        bottlebox cokebox = new bottlebox("Puit", 10, 3000, 3.0);
        
        cokebox.fillBox(cokeBarrel.emptyBarrelToBottles(can2));
    }
}