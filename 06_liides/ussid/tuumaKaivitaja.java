import java.util.*;

public class tuumaKaivitaja {
    ManguTuum kaivitatav;
    public tuumaKaivitaja(ManguTuum uusKaivitatav){
        kaivitatav = uusKaivitatav;
        new Timer().scheduleAtFixedRate(new TimerTask() {
            public void run(){
                kaivitatav.step();
                System.out.println(Arrays.deepToString(kaivitatav.snekLocations()));
                System.out.println(Arrays.toString(kaivitatav.appleLocation()));
                int test = kaivitatav.getApple();
                if(test == 1){
                     System.out.println("said kätte");
                     kaivitatav.randomAppleLocation();
                     System.out.println(Arrays.toString(kaivitatav.appleLocation()));
             }
            }
        }, 0, 2000);
    }   
}
