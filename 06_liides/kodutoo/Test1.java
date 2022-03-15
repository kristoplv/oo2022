import java.io.*;

public class Test1 {
    public static void main(String[] args){
        searchIF find = new searchClass();
        find.whereToSearch("youtube");

        searchIF find1 = new searchClass();
        find1.whereToSearch("google");

        searchIF find2 = new searchClass();
        find2.whereToSearch("skillshare");
        while(true){
            System.out.println("Opime midagi huvitavat?[0][1]");
            int ans = Integer.parseInt(System.console().readLine());
            if(ans == 0){
                break;
            } else {   
                System.out.println("Mida täna Oppida soovid?:");
                String toLearn = System.console().readLine();
                find.whatToSearch(toLearn);
                find.searchCore();
                find1.whatToSearch(toLearn);
                find1.searchCore();
                find2.whatToSearch(toLearn);
                find2.searchCore();
            }
        }
    }
}
