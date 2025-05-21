import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // Store a set of integer
        int[] arr = new int[] {4, -10, 100,55};
        // ! int[] cannot store non-int values

        // Auto-box -> 變咗object
        // long -> Long (Number)
        // byte -> Byte (Number)
        Number[] numbers = new Number[] {3L, (byte)5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    
        // ! object arrays可以放晒任何object, 但compile time, 指針在object, 所以只會出現在object的能力，副runtime時先會到佢CHILD
        // Object[] objects = new Object[] {new Cat(), 4L, (byte)10}; 

        // ! Disadvantage of  int[]
        // 1. fixed length

        // Array is the most underlying data structure
        // ArrayList is a high level dat structure for storing a set of values
            // For user, you doesn't even know it is made by array

        // ArrayList
        // 1. variable length -> 但其實memory負荷可能會好重,因為要copy好多次arrays
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(10); // auto-box from int to Integer
        integers.add(-3);
        System.out.println(integers.size()); // -3

        // add() vs size()
        // add() -> new array process, copy array
        // size() -> array length

        // LocalDate
        LocalDate[] dd = new LocalDate[3];

        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
        dates.add(LocalDate.of(2025, 5, 7));
        dates.add(LocalDate.of(2025, 5, 8));
        System.out.println(dates.size()); // 2

        // ! remove() 
        // 1. for loop
        // 2. use Localdate's equals()
        dates.remove(LocalDate.of(2025, 5, 7));

        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Peter");
        names.add(new String("Sally"));
        System.out.println(names.remove("John")); // ! true -> 行咗equals() equals由作者去定義, 之後就能根據佢個定義
        System.out.println(names.remove("Jenny")); // false

        // so, at this moment, you should understand why equals() is important for every class

        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("John"));
        cats.add(new Cat("Peter"));
        System.out.println(cats.remove(new Cat("John")));
        

        // BigDecimal -> but seldom used
        ArrayList<BigDecimal> decimals = new ArrayList<BigDecimal>();
        decimals.add(BigDecimal.valueOf(3.5)); // BigDecimal冇autobox
        decimals.add(BigDecimal.valueOf(4.7));
        decimals.remove(new BigDecimal("3.5")); // 一樣可以remove
        System.out.println(decimals.size()); // 1

        // Create a list of Double, remove some of them
        // because Double equals() is working...
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(2.4);
        doubles.add(5.7);
        doubles.remove(5.7);
        System.out.println(doubles.size());

        Double d1 = 3.9;
        Double d2 = 3.9;
        System.out.println(d1.equals(d2)); // true
        System.out.println(d1.compareTo(d2)); // 0

        // addAll()
        ArrayList<Double> newDoubles = new ArrayList<Double>();
        newDoubles.add(10.9);
        newDoubles.add(4.1);
        newDoubles.add(8.8);
        doubles.addAll(newDoubles);
        System.out.println(doubles.size()); // 4
        System.out.println("haha" + doubles);


        // for-each loop
        // 1. By default loop through all elements(沒有i)
        // ! ArrayList會用呢個比較多
        for (Double x : doubles) {
            System.out.println(x);
        }
        // ArrayList -> underlying structure is aaray.
        // concept -> index
        for (int i = 0; i < doubles.size(); i++) {
            System.out.println("value" + doubles.get(i));
        }

        int[] arr2 = new int[] {3, -1, 100};
        // Loop all elements of int array
        for (int x : arr2) {
            System.out.println(x);
        }

        // ! for-each loop (Array or ArrayList)
        // for loop (basic, use int i as counter)

        // ! basic for loop (advantage): Access 2 elements in one iteration, for-each不能
        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.println(arr2[i]);
            System.out.println(arr2[i + 1]);
        }

        // ! ArrayList工具
        // 1. contains() -> true or false
        System.out.println(doubles.contains(10.9)); // true

        // 2. isEmpty() -> true / false
        System.out.println(doubles.isEmpty()); // false

        // 3. get(), set(index, value) -> 看index裡面的value
        System.out.println(doubles.get(0)); // 2.4
        doubles.set(0, 9.9);
        System.out.println(doubles.get(0)); // 9.9

        // 4. clear() -> 清除ArrayList
        doubles.clear(); // assign 0 size array
        // new Double[0]
        System.out.println(doubles.size()); // 0
        System.out.println(doubles);

        // ! clear() vs null
        // doubles -> ArrayList Object Address
        doubles = null;

        // read -> get(index) -> 沒有用for loop, contains(), isEmpty()
        // write / modify -> set(), clear(), add(), remove()
        
 }
}

