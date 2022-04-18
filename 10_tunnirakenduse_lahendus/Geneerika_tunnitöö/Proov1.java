import java.util.*;

public class Proov1 {
    public static void main(String[] args) {
        List<String> firstNames = new LinkedList<>();
        firstNames.add("kati");
        firstNames.add("kartoger");
        firstNames.add("kadri");
        firstNames.add("kaspi");
        firstNames.add("katid");
        //firstNames.add(1, "Pablo");

        //System.out.println(firstNames);
        for(String name : firstNames){
// koolon ehk ":" tähendab javas sama mis pythonis tähendab "in"
            System.out.println(name);
        }
        //Iteraator
        Iterator<String> it = firstNames.iterator();
        while(it.hasNext()){
            String eesnimi = it.next();
            System.out.println(eesnimi);
        }

        //Hash set
        Set<String> names = new HashSet<>(firstNames);
        System.out.println(names);

        // String map
        String[] bigFirstNames = names.toArray(new String[]{});
        System.out.println(Arrays.toString(bigFirstNames));

        int wherePablo = firstNames.indexOf("Pablo");
        if(wherePablo >= 0){
            System.out.println("pablo on kohal "+wherePablo);
        } else{
            System.out.println("no pablo here");
            System.out.println(wherePablo);
        }


    }
}
