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
        this.fats = this.toit.rasvad;
        this.proteins = this.toit.valgud;
        this.carbs = this.toit.susivesikud;
        System.out.println(this.proteins);
        System.out.println(this.carbs);
        System.out.println("Toidus on "+this.fats +"g rasva?!");
    }
}
