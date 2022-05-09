class toiduaine {
    double maxKogus = 100;
    String nimetus;
    double valgud, rasvad, susivesikud, vesi;
    boolean deleted = false;
    public toiduaine(String newName, double newProtein, double newFats, double newCarbs, double newWater){
        this.nimetus = newName;
        this.valgud = newProtein;
        this.rasvad = newFats;
        this.susivesikud = newCarbs;
        this.vesi = newWater;
        this.kontrolliKogust();
    }
    public void kontrolliKogust(){
        double saadudKogus = this.valgud + this.rasvad + this.susivesikud + this.vesi;
        if(saadudKogus > this.maxKogus){
            this.deleted = true;
            System.out.println("Maru tugev kartul sul. Protsendid olid valed, kustutame klassi");
        }
    }
    public void printFood(){
        System.out.println("Nimi : "+this.nimetus + " |  Valgud : "+this.valgud + " |  Rasvad : "+this.rasvad + " |  Susivesikud : "+this.susivesikud);
    }

}
