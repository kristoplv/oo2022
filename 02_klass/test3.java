public class test3 {
    public static void main(String[] args){
        String location = "@hotmail.com";
        String howMany = args[0];

        Generator gen = new Generator();
        String fileName = gen.fileCreator(args);
        gen.randomEmail(fileName, howMany, location);
        
    }
}
