class toidukomponent {
    String toiduNimi;
    double kogus;
    toiduaine toit;
    double fats, proteins, carbs;
    public toidukomponent(String newFoods, double newAmounts, toiduaine uusToit){
        this.toiduNimi = newFoods;
        this.kogus = newAmounts;
        this.toit = uusToit;
    }

    public void leiaRasv(){
        double fatsAmount = this.toit.rasvad * kogus/100;
        this.fats = fatsAmount;
        this.proteins = this.toit.valgud * kogus/100;
        this.carbs = this.toit.susivesikud * kogus/100;
        System.out.println("Toidus on "+fatsAmount +"g rasva?!");
    }
}
