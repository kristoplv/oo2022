import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class toit {
    String filename = "toidud.txt";
    String toiduNimetus;
    ArrayList<toidukomponent> komponendid;
    double kogus;
    double fats, carbs, protein;

    public toit(String uusToit, ArrayList<toidukomponent> uuedToiduained, double uusKogus){
        this.toiduNimetus = uusToit;
        this.komponendid = uuedToiduained;
        this.kogus = uusKogus;
        this.findNutrition();
    }

    public void findNutrition(){
        for(int i =0; i<komponendid.size(); i++){
            this.protein += komponendid.get(i).fats;
            System.out.println(this.protein);
            this.fats += komponendid.get(i).carbs;
            this.carbs += komponendid.get(i).proteins;
        }
    }
    public void printInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Toit : "+this.toiduNimetus + " | Kogus: "+this.kogus);
        System.out.println("Rasvad: "+ this.fats + " | Valgud : "+ this.protein + " | Susivesikud : "+this.carbs);
        for(int i =0; i<this.komponendid.size(); i++){System.out.println("Vaja laheb: "+this.komponendid.get(i).toiduNimi + "  "+this.komponendid.get(i).kogus+" grammi");this.komponendid.get(i).toit.printFood();}
        this.sendToText();
    }

    public void sendToText(){

        try{
            File newFile = new File(this.filename);
            FileWriter writer = new FileWriter(filename, true);
            writer.write("----------------------------------------------------------------");
            writer.write("\n");
            writer.write("Toit : "+this.toiduNimetus + " | Kogus: "+this.kogus);
            writer.write("\n");
            writer.write("Rasvad: "+ this.fats + " | Valgud : "+ this.protein + " | Susivesikud : "+this.carbs);
            writer.write("\n");
            for(int i =0; i<this.komponendid.size(); i++){writer.write("Vaja laheb: "+this.komponendid.get(i).toiduNimi + "  "+this.komponendid.get(i).kogus+" grammi");
                writer.write("\n");
                writer.write("Nimi : "+this.komponendid.get(i).toit.nimetus + " |  Valgud : "+this.komponendid.get(i).toit.valgud + " |  Rasvad : "+this.komponendid.get(i).toit.rasvad + " |  Susivesikud : "+this.komponendid.get(i).toit.susivesikud);
                writer.write("\n");
            }
            writer.close();

        
        
        
        }
        catch(IOException ex){
            System.out.println("Probleem, stacktrace siin :"+ex);

        }
    }
    
}
