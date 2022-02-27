public class test1 {
    public static void main(String[] args){
        newEmail e1 = new newEmail("@gmail.com");
        newEmail e2 = new newEmail("@hotmail.com");
        newEmail e3 = new newEmail("@yahoo.com");
        Generator gen1 = new Generator("gen1");
        gen1.addEmail(e1);
        gen1.addEmail(e2);
        gen1.addEmail(e3);
        gen1.generateEmails(Integer.parseInt(args[0]));
    }
}
