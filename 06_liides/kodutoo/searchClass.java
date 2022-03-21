import java.awt.Desktop;
import java.net.*;

public class searchClass implements searchIF{
    String platform;
    String search;
    public void whereToSearch(String searchPlatform){platform = searchPlatform;}
    public void whatToSearch(String newSearch){search = newSearch;}
    public void searchCore(){
        String newURL = "";
        int counter = 0;
        //https://www.youtube.com/ + javascript
        //https://www.youtube.com/results?search_query=
        System.out.println(platform);
        if(platform.equals("youtube")){
            newURL = "https://www.youtube.com/results?search_query=learn+"+search;
            counter = 1;
        }
        if(platform.equals("google")){
            newURL = "https://www.google.com/search?&q=learn+"+search;
            counter = 1;
        }
        if(platform.equals("skillshare")){
            newURL = "https://www.skillshare.com/search?query="+search;
            counter = 1;
        }
        if(counter == 0) {
            newURL = "https://www.google.com/search?&q=learn+"+search;
        }
        try{
            Desktop.getDesktop().browse(new URL(newURL).toURI());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sth wrong");
        }
    }

}
