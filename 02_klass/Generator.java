import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Generator{
    public String fileCreator(String[] args){
        String filename = args[1] +".txt";
        try {
            File newFile = new File(filename);
            if(newFile.createNewFile()){
                System.out.println("Fail loodud: "+newFile.getName());
            } else {
                System.out.println("Fail juba olemas");
            }
        } catch (IOException e){
            System.out.println("Fail juba eksisteerib, alustame kirjutamist");
        }
        return filename;
}
public String randomEmail(String filename, String count, String loc){
    String hello = "hello";
    Integer numberOfEmails = Integer.parseInt(count);
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
        String email = nameArray[randomNrEmail] +randomNr +loc;
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
}