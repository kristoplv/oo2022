public class battleshipTuum1 implements battleshipTuum{
    int laevX, laevY, shipHealth; // Lisatud laeva elude muutuja
    int pommitusX, pommitusY;
    final int laius=10, korgus=10, maxHealth = 4; //maksimum elud

    public void asetaLaev(){
        laevX=(int)(laius*Math.random());
		laevY=(int)(korgus*Math.random());
        shipHealth= (int)(maxHealth*(Math.random())) + 1; // +1 et ei tuleks 0 eluga laeva
    }

    public void pommitus(int x, int y){
        pommitusX = x; pommitusY = y;
    }

    public int[] pommita(){
        return new int[]{pommitusX, pommitusY};
    }

    public int[] laevaKoht(){
        return new int[]{laevX, laevY};
    }

    public int laevaX(){
        return laevX;
    }

    public int laevaY(){
        return laevY;
    }

    public String tulemus(){
        if(pommitusX == laevX && pommitusY == laevY){
            return "pihtas";
        }else {
            return "moodas";
        }
    }
    public void damageShip(){shipHealth--;System.out.println("Laeva elud: " +Integer.toString(shipHealth));} // Välja kutsumisel -1 elu ja prindime elud konsooli
    public int returnHealth(){return shipHealth;} // Tagastame laeva elud
}