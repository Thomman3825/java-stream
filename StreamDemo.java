package streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(66);
        list.add(6);
        list.add(83);
        list.add(57);
        list.add(9);

        Stream <Integer> stream = list.stream();

        // stream.forEach((k)->System.out.print(k+" "));
    //     System.out.println();
    //     System.out.println("Even Stream");
    //     Stream<Integer> evenStream = stream.filter(k-> k%2==0);
    //     // evenStream.forEach((t)->System.out.print(t));
    //    Stream<Integer> mappedStream = evenStream.map(k-> k+1);
    //     // mappedStream.forEach((k)->System.out.print(k+" "));
    //     int sumOfMapped = mappedStream.reduce(0,(p,q)-> p+q);
    //     System.out.print(sumOfMapped);

        int sumOfMapped = stream.filter(k->k%2==0).map(k->k+1).reduce(0,(p,q)->p+q);
        System.out.println(sumOfMapped);
        

    }
}
