public class proov1 {
    public static double sideAreaAdded(Kujund[] m){
        double sum = 0;
        for(Kujund k: m){
            sum+=k.sideArea();
        }
        return sum;
    }
    public static void main(String[] args){
        Kujund[] kd = new Kujund[3];
        kd[0] = new nSideCuboid(2, 3, 4);
        kd[1] = new nSideTetrahedron(2, 2, 4);
        System.out.println(kd[0].sideArea());
        System.out.println(kd[1].sideArea());
    }
}
