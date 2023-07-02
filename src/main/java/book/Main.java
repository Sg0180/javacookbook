package book;

public class Main {
    public static void main(String[] args){
        System.out.println("System.getenv(\"PATH\") = " + System.getenv("PATH"));
        System.getProperties().forEach((k,v)-> System.out.println(k+"->"+v));
        System.out.println(System.getProperty("os.arch"));
    }
}
