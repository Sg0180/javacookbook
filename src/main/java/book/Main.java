package book;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static String[] processString(String line){
        int i = 0;
        String[] result =  new String[5];
        StringTokenizer st =  new StringTokenizer(line,"|",true);
        while(st.hasMoreTokens()){
            String s =  st.nextToken();
            if(s.equals("|")){
                i++;
                continue;
            }
            result[i] = s;
        }

        return result;
    }
    public static  void main(String[] args){
        int result = 103;
        System.out.println(result + '='+ "is the answer");
        /* Java 14
        long string with triple quotes like python
         String longString = """thad
                              sadff
                              sdafsd""";
         */

        String a  = "Java is great";
        System.out.println(a);
        String b2 =  a.substring(2);
        System.out.println(b2);
        for (String s:a.split(" ")) {
            System.out.println(s);
        }
        StringTokenizer st = new StringTokenizer(a);
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }

        st =  new StringTokenizer("Heelo, World| |JAVa",", |",true);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println(Arrays.toString(processString("A||B|C")));

        String news = "This is a string. That is going to be joined with a comma";
        String jjoin =  news.join(",", news.split("[ |\\.]"));
        System.out.println(jjoin);
        for (char ch: jjoin.toCharArray()
             ) {
            System.out.println(ch);
        }
        jjoin.chars().forEach(cd -> System.out.println((char)cd));
        // UnicodeChars.java
        StringBuilder b = new StringBuilder(); for (char c = 'a'; c<'d'; c++) {
            b.append(c);
        }
        b.append('\u00a5');
        b.append('\u01FC');
        b.append('\u0391');
        b.append('\u03A9');
// Japanese Yen symbol
// Roman AE with acute accent
// GREEK Capital Alpha
// GREEK Capital Omega
        for (int i=0; i<b.length(); i++) { System.out.printf(
                "Character #%d (%04x) is %c%n", i, (int)b.charAt(i), b.charAt(i));
        }
        System.out.println("Accumulated characters are "+b);

    }
}
