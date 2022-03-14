import java.util.Arrays;
import java.io.*;

public class Proov1 {
     public static void main(String[] args) throws IOException{
         ManguTuum mt = new ManguTuum1();
         mt.randomAppleLocation();
         System.out.println(Arrays.toString(mt.appleLocation()));
         mt.randomAppleLocation();
         System.out.println(Arrays.deepToString(mt.snekLocations()));
         System.out.println(Arrays.toString(mt.appleLocation()));
         new tuumaKaivitaja(mt);
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         while(true){
             String rida = br.readLine();
             if(rida.length()>0){
                 if(rida.charAt(0)=='l'){mt.left();}
                 if(rida.charAt(0)=='r'){mt.right();}
                 if(rida.charAt(0)=='u'){mt.up();}
                 if(rida.charAt(0)=='d'){mt.down();}
                }
         }
        }  
}
