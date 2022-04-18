public class TypeProov3{
    public static void main(String[] args) {
        pairCounter<Character> p1 = new pairCounter<>();
        String lause = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam quis lectus vel felis bibendum egestas eu vel odio. Proin porttitor diam et rhoncus porta. Praesent purus nunc, rutrum id ligula et, luctus malesuada nisi. Donec lectus tellus, finibus sit amet iaculis a, placerat eu turpis. Vestibulum ante eros, molestie eget sem ultricies, varius consequat odio. Aenean tellus neque, tempus sed tincidunt eu, congue pellentesque arcu. Phasellus aliquam ipsum est, et placerat odio interdum non. Nulla facilisi. Proin ac augue ac justo placerat pretium. Fusce pulvinar sagittis ultricies. Nulla vehicula nulla maximus, egestas metus non, pellentesque odio.";
        for(int i =0; i<lause.length(); i++){
            p1.addNew(lause.charAt(i));
        }
        System.out.println(p1.ordered());
    }
}