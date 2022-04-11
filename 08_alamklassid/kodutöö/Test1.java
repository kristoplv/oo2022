public class Test1 {
    public static void main (String[] args){
        System.out.println("Mis hinded õpilane sai?");
        System.out.println("Hinded : 20, 11, 10");
        System.out.println("Lävend: 40");
        controlTest test1 = new controlTest(20, 11, 10, 40);
        double ans1 = test1.calcPercent();
        if(ans1 > 100.0){
            System.out.println("Hinne liiga suur, kontrolli ule!");
        } else {
            System.out.println(ans1);
        }
        controlTest test2 = new fourGrades(10, 10, 10, 10, 40);
        double ans2 = ((fourGrades)test2).calcPercent();
        if(ans2 > 100.0){
            System.out.println("Hinne liiga suur, kontrolli ule!");
        } else {
            System.out.println(ans2);
        }
    }
}
