public class test2 {
    public static void main(String[] args){
        String location = "@yahoo.com";
        String howMany = args[0];

        Generator gen = new Generator();
        String fileName = gen.fileCreator(args);
        gen.randomEmail(fileName, howMany, location);
        
    }
}
