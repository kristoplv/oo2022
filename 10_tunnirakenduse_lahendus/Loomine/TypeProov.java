public class TypeProov {
    public static void main(String[] args) {
        sameTypePairs<Integer> location = new sameTypePairs<>();
        location.first = 7;
        location.second = 4;
        System.out.println(location.first);
        System.out.println(location);

        sameTypePairs<String> fullName = new sameTypePairs<>();
        fullName.first = "Kristo";
        fullName.second = "Polluvee";

        System.out.println(fullName);

    }
    
}
