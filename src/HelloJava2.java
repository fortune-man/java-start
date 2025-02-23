public class HelloJava2 {

    private static int ITERATE = 10;

    public static void main(String[] args) {
        String helloword = "\nhello java";

        for (int i = 1; i < ITERATE+1; i++) {
            System.out.print(helloword + i) ;
        }
    }
}
