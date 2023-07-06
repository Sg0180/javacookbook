package book;

interface CheckEven {
    public boolean test(int n);
}

interface NumericTest{
    public boolean test(int n);
}

interface StringFunc{
    public String func(String s);
}

interface SomeFunc<T>{
    T func(T t);
}
public class Main {
    public static  void main(String [] args){
        CheckEven f =  (n) -> n%2==0;
        System.out.println(f.test(10));
        NumericTest checkeven =  (n) -> n%2== 0;
        NumericTest checknegative  = (n) -> n<0;

        System.out.println(checkeven.test(10));
        System.out.println(checknegative.test(-10));

        StringFunc reverse =  (s) ->{
            StringBuilder rs = new StringBuilder(s);
            return rs.reverse().toString();
        };
        System.out.println(reverse.func("Hello,world!!"));
        System.out.println(reverse.func("lambda"));

        SomeFunc<String> stringreverse = (s)->{
            StringBuilder rs  = new StringBuilder(s);
            return rs.reverse().toString();
        };
        SomeFunc<Integer> factorial = (s)-> {
            int prod = 1;
            for(var i =1; i<=s;i++){
                prod *= i;
            }
            return prod;
        };
        factorial = (s)->10;
        System.out.println(stringreverse.func("generic testing"));
        System.out.println(factorial.func(10));



    }
}
