public interface battleshipTuum{
    public void asetaLaev();
    public int[] pommita();
    public void pommitus(int x, int y);
    public String tulemus();
    public int[] laevaKoht();
    public int laevaX();
    public int laevaY();
    public int returnHealth(); //Uued meetodid, see tegeleb laeva elude tagastamisega
    public void damageShip(); //Uued meetodid, see tegeleb laeva elude vähendamisega
}