import java.util.*;
import java.io.*;
public class battleshipProov{
	public static void main(String[] arg) throws IOException{
		battleshipTuum mt=new battleshipTuum1();
        
        /* Lisasin "int i", mis on loopi suurenev counter.
        int shipAmount omag kasutaja sisestust, mitu laeva genereerime
        mt.returnHealth annab meile ühe laeva elud.*/


        int i = 0;
        System.out.println("Mitu laeva genereerime?");
        BufferedReader inputUser=new BufferedReader(new InputStreamReader(System.in));
        int shipAmount = Integer.parseInt(inputUser.readLine());


        mt.asetaLaev();
        System.out.println("Laeva koht: "+Arrays.toString(mt.laevaKoht())+". Laeva elud: "+Integer.toString(mt.returnHealth()));
        int x = 0, y = 0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(i<shipAmount){
			String rida=br.readLine();
            if(rida.length()>1){
                x = Integer.parseInt(Character.toString(rida.charAt(0)));
                y = Integer.parseInt(Character.toString(rida.charAt(1)));
            }
            if(x == mt.laevaX() && y == mt.laevaY()){
                    mt.pommitus(x, y);
                    System.out.println("Pommitus: "+Arrays.toString(mt.pommita()));
                    System.out.println(mt.tulemus());
                    mt.damageShip();
                    if(mt.returnHealth() <=0){ //Kui elud 0, lähme uuele loopile
                        i++;
                        if(i==shipAmount-1){ // Kui on maha pommitatud kõik laevad, lõpetame loopi enne uue laeva genereerimist
                            break;
                        } else{
                            mt.asetaLaev();
                        }
                    }
                    System.out.println("Laeva koht: "+Arrays.toString(mt.laevaKoht())+". Laeva elud: "+Integer.toString(mt.returnHealth()));

            } else { //Siin palju korduvat koodi, et teha konsooli printimine ilusamaks
                mt.pommitus(x, y);
                System.out.println("Pommitus: "+Arrays.toString(mt.pommita()));
                System.out.println(mt.tulemus());
                System.out.println("Laeva koht: "+Arrays.toString(mt.laevaKoht())+". Laeva elud: "+Integer.toString(mt.returnHealth()));
            }
        }
	}
}