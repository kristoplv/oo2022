import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class EmailGen {
    public static String fileCreator(){
        try {
            File newFile = new File("emails_passwords.txt");
            if(newFile.createNewFile()){
                System.out.println("Fail loodud: "+newFile.getName());
            } else {
                System.out.println("Fail juba olemas");
            }
        } catch (IOException e){
            System.out.println("Fail juba eksisteerib, alustame kirjutamist");
        }
        String filename = "emails_passwords.txt";
        return filename;
    }
    public static String randomEmail(String filename, String arg){
        String hello = "hello";
        Integer numberOfEmails = Integer.parseInt(arg);
        String[] nameArray = {
            "Mati", "Jaanus", "Tanja", "Jurgen", "Kristo", "Mehis", "Reiko", "Raigo",
            "Toomas", "Juhan", "Daniil","Manglus","Mateo","Sten","Ruslan","Jaan","Egon",
            "Leet","Robert","Valdek","Leiger","Ulvar", "Eric","Hendrik" 
        };
        for(int i=0; i<numberOfEmails; i++){
            int randomNr = ThreadLocalRandom.current().nextInt(0, 150);
            int randomNrEmail = ThreadLocalRandom.current().nextInt(0, nameArray.length);
            String password = ThreadLocalRandom.current().nextInt(0, 150) +nameArray[ThreadLocalRandom.current().nextInt(0, nameArray.length)]
            +ThreadLocalRandom.current().nextInt(100, 15000);
            String email = nameArray[randomNrEmail] +randomNr +"@gmail.com";
            try {
                FileWriter writer = new FileWriter(filename, true);
                writer.write("email: "+email);
                writer.write("  / password: "+password);
                writer.write("\n");
                writer.close();
                System.out.println("Email lisatud tekstifaili: "+email);
                System.out.println("parool lisatud tekstifaili: "+password);
            } catch (IOException e){
                System.out.println("jama tekkis");
            }
        }
        return hello;
    }
    public static void main(String[] args){
        String filename = fileCreator();
        System.out.println(filename);
        randomEmail(filename, args[0]);
    }
}
/*
--README ALA--
Programmi mõte on genereerida random gmaili meiliaadress ja sellele vastav parool mistahes
heal/halval eesmärgil. Alguses loob programm meile tekstifaili, mis sisaldab meie järgnevaid andmeid (Kui fail on juba olemas,
siis anname vastava teate ja liigume edasi). Seejärel alustame meiliaadressi ja parooli loomisega. Kirjutasin ühe massiivi
suvalistest nimedest mis ma internetist leidsin ning kasutan java.util.concurrent.ThreadLocalRandom library't et ma saaks
random numbreid genereerida (mille ma vastavusse viin mingi nimega massiivist). Umbes sarnane lähenemine on ka paroolile. 
Muidugi on ka catcherid, kui midagi peaks katki minema kuskil koodis. Terminalist käivitades saad anda kaasa numbri, mis
kirjeldab, kui mitu "kasutajat" me loome. Terminalis anname ka teada meiliaadressist ja paroolist, mille programm lõi.

Kasutasin igas meetodis try/catch'i kuna kasutasin tekstifailis kirjutamiseks FileWriter package-it. Nagu kohane OOP-le, 
jätsin "main" meetodi suht tühjaks, enamus koodi asub kahes meetodis.
*/
