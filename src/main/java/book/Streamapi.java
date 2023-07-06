package book;

import javax.swing.text.html.Option;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamapi {
    public static void main(String[] args){
        var myList = List.of(1,2,3,4,5,6);
        var stream =  myList.stream();
        Optional<Integer> value= stream.max(Integer::compare);
        if (value.isPresent()){
            System.out.println(value.get());
        }


        List<Integer> anotherList =  new ArrayList<>();
        anotherList.add(1);
        anotherList.add(2);
        anotherList.add(3);

        Stream<Integer> stream1 =  anotherList.stream();
        stream1.forEach(System.out::println);


        Stream<Integer> sortedStream =  myList.stream().sorted();
        sortedStream = sortedStream.filter(n -> n%2 ==1);
        var list = sortedStream.collect(Collectors.counting());
        System.out.println("list"+list);




        /// stream.filter
        /// stream.map
        /// stream.reduce
        /// stream.sorted()
        /// stream.collect(Collectors.toList())
        /// stream.forEach(Consumer)
        ///

        var accumlatedList  = List.of(1,2,4,5,6,7,9);
        int sum = accumlatedList.stream().filter(n-> n%2==0).reduce(0, (s,n)-> s+n);
        int  maxi = accumlatedList.stream().reduce(0, (m,n) -> { if(m< n) m = n; return m;});
        System.out.println(maxi);

        Stream<Double> sqrtStream =  accumlatedList.stream().map(integer -> Math.sqrt(integer));
        //sqrtStream.mapToInt(Double::intValue).forEach(System.out::println);
        sqrtStream.spliterator().forEachRemaining(System.out::println);
    }
}
