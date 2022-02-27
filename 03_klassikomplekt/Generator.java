import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Generator{
    String[] nameArray = {
        "Mati", "Jaanus", "Tanja", "Jurgen", "Kristo", "Mehis", "Reiko", "Raigo",
        "Toomas", "Juhan", "Daniil","Manglus","Mateo","Sten","Ruslan","Jaan","Egon",
        "Leet","Robert","Valdek","Leiger","Ulvar", "Eric","Hendrik", "Keiti", "Oleg" 
    };
    List<newEmail> Emails = new ArrayList<newEmail>();
    String name;
    public Generator(String newName){name = newName;}
    public void addEmail(newEmail em){Emails.add(em);}
    public String printInfo(){
        for(int i=0; i<=2; i++){
            System.out.println(Emails);
        }
        return "hello";
    }
    public String fullEmail(newEmail rand){
        int random = ThreadLocalRandom.current().nextInt(0, nameArray.length);
        int addRandomNumber = ThreadLocalRandom.current().nextInt(0, 150);
        String email = nameArray[random]+addRandomNumber+ rand;
        return email;

    }


    public String randomEmail(){
        int randomNr = ThreadLocalRandom.current().nextInt(0, Emails.size());
        String randEmail = fullEmail(Emails.get(randomNr));
        return randEmail;

    }
    public String randomPasswordGen(){
        int addRandomNumber = ThreadLocalRandom.current().nextInt(0, 150);
        int addRandomNumber2 = ThreadLocalRandom.current().nextInt(0, 150);
        int random = ThreadLocalRandom.current().nextInt(0, nameArray.length);
        String randName = nameArray[random];
        String password = addRandomNumber + randName + addRandomNumber2;
        return password;
    }

    public void generateEmails(Integer amount){
        String filename = "random_emails.txt";
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
        for(int i=0; i<amount; i++){
            String randHandle = randomEmail();
            String randPassword = randomPasswordGen();
            try {
                FileWriter writer = new FileWriter(filename, true);
                writer.write("email: "+randHandle);
                writer.write("  / password: "+randPassword);
                writer.write("\n");
                writer.close();
                System.out.println("Email lisatud tekstifaili: "+randHandle);
                System.out.println("parool lisatud tekstifaili: "+randPassword);
            } catch (IOException e){
                System.out.println("jama tekkis");
            }
        }
    }
}