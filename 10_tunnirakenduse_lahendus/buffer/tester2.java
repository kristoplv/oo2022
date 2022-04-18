public class tester2 {
    public static void main(String[] args) {
        Arvutaja<String, String> p1 = new bufferer<String, String>(new firstLetterFinder());
        System.out.println(p1.f("~tilde"));
        System.out.println(p1.f("chinga"));
        System.out.println(p1.f("uugabuua"));
        System.out.println(p1.f("dudu"));
        System.out.println(p1.f("bunga"));
        System.out.println(p1.f("wunga"));
        System.out.println(((bufferer)p1).buffer);

    }
    
    
}
