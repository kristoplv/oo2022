public class TypeProov2 {
    public static void main(String[] args) {
        pairCounter<Integer> p1 = new pairCounter<>();
        p1.addNew(3);
        p1.addNew(2);
        p1.addNew(5);
        p1.addNew(3);
        p1.addNew(3);
        p1.addNew(2);
        System.out.println(p1.counter);
    }
    
}
