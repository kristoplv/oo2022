import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileGeoAverage {
    List<Double> filelist;
    String fileName;
    public fileGeoAverage(String uFileName){
        fileName = uFileName;
    }

    public List<Double> getGeometricAverage(){
        Double geoAverage = 1.0;
        for(int i=1; i<filelist.size(); i++){
            geoAverage *= filelist.get(i);
        }
        double arrLength = filelist.size()-1;
        geoAverage = Math.pow(geoAverage, 1/arrLength);
        List<Double> calcList = new ArrayList<Double>();
        for(int i=0; i<filelist.size(); i++){
            if(i == 0){
                calcList.add(filelist.get(i));
            } else {
                calcList.add(calcList.get(i-1) * geoAverage);
            }
        }
        System.out.println("Geomeetriline keskmine failis asuvatele koefitsentidele: "+geoAverage);
        return calcList;
    }

    public List<Double> readFileLines(){
        List<Double> newFileList = new ArrayList<Double>();
        try{
            File newFile = new File(fileName);
            Scanner read = new Scanner(newFile);
            while(read.hasNextLine()){
                double readValue = Double.parseDouble(read.nextLine());
                newFileList.add(readValue);
            }
            read.close();
        } catch(FileNotFoundException e){
            System.out.println("Sellist faili pole!");
        }
        filelist = newFileList;
        return newFileList;
    }

    public List<Double> getSourceCalculations(){
        List<Double> calcList = new ArrayList<Double>();
        for(int i=0; i<filelist.size(); i++){
            if(i==0){
                calcList.add(filelist.get(i));
            } else {
                calcList.add(calcList.get(i-1) * filelist.get(i));
            }
        }
        return calcList;
    }
    public void createPaychangefile(){
        List<Double> fileList = getGeometricAverage();
        List<Double> filelistCalculated = getSourceCalculations();
        try{
            File newfile = new File("uuedPalgamuutused.txt");
            newfile.createNewFile();
            FileWriter writer = new FileWriter(newfile);
            for(int i=0; i<fileList.size(); i++){
                String valueOld = Double.toString(Math.round((filelistCalculated.get(i)*100)/100));
                String value = Double.toString(Math.round((fileList.get(i) *100)/100));
                writer.write(valueOld+": võrreldes geomeetrilisega :"+value);
                writer.write("\n");
            }
            writer.close();
            System.out.println("Fail loodud, vaartused pandud faili!");
        } catch(IOException e){
            System.out.println("miski läks katki, proovi hiljem uuesti");
        }
    }
}
