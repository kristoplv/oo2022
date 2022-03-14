import java.io.*;
import java.util.*;

public class textLogger implements Logija{
    String filename;
    public textLogger(String fn){this.filename = fn;}
    public void logi(String text){
        try{
            File newfile = new File(filename);
            FileWriter pw = new FileWriter(newfile, true);
            pw.write(new java.util.Date()+" "+text+"\n");
            System.out.println("peaks tootama");
            pw.close();
        } catch (IOException e){
            System.out.println("miski katki");
        }
    }
}
