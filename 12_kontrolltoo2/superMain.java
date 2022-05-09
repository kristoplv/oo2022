import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

public class superMain {
    public static void main(String[] args) {
        // Loome toiduaine
        toiduaine kartul = new toiduaine("kartul", 1.9, 0.1, 16.9, 80.1);
        toiduaine hapukoor = new toiduaine("hapukoor", 3.0, 10.0, 4.1, 82.2);
        toiduaine vorst = new toiduaine("vorst", 12, 12, 4.1, 67.7);
        if(kartul.deleted){
            kartul = null;
        } else {
            kartul.printFood();
            hapukoor.printFood();
        }
        toidukomponent nKartul = new toidukomponent("kartul", 100, kartul);
        toidukomponent nHapukoor = new toidukomponent("hapukoor", 100, hapukoor);
        toidukomponent nVorst = new toidukomponent("Vorst", 100, vorst);
        nKartul.leiaRasv();
        nHapukoor.leiaRasv();

        // ül 2

        ArrayList<toidukomponent> vajalikud = new ArrayList<toidukomponent>();
        vajalikud.add(nKartul);
        vajalikud.add(nHapukoor);
        vajalikud.add(nVorst);
        

        toit kartulisalat = new toit("Kartulisalat", vajalikud, 3000);
        kartulisalat.printInfo();
        try{

            FileReader fr = new FileReader("toidud.txt");
            int i;
            System.out.println("------------TESTAREA------------");
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println("------------TESTAREA------------");
        }catch(IOException ex){
            System.out.println("sth wrong, vaata stackTrace-i: "+ex);
        }

    }
}
