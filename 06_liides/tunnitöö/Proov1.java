import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Proov1 {
    public static void main(String[] args) {
        if(args.length==2){
            Integer value = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
            System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
            proovLogija.logi(String.valueOf(value));
        }
    }
}
