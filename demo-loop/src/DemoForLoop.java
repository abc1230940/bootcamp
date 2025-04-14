public class DemoForLoop {
    public static void main(String[] args) {
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println(x); // 16

        int y = 2; // i 可以不參與loop
        int value = 2;
        for (int i = 0; i < 3; i++) {
            value = y * value;
        }
        System.out.println(value);

        // base = ?, + 8 (10 times)

        int num1 = 9;
        int num2 = 17;
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        System.out.println(max);

        // 0 - 100, Find the largest odd number, which is < 90
        // for
        int n = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0 && i < 90 && i > n) {
                n = i;
            }
       }
       System.out.println(n);

       // 0 - 20, sum up all even numbers
       // 0 + 2 + 4...
       int m = 0;
       for (int i = 0; i < 21; i++) {
        if (i % 2 == 0) {
            m += i;
        }
        
       }
       System.out.println(m);

       // 0 - 30, if < 20, sum up odd numbers, if >= 20, sum up even numbers
       // result
       int oddNumbers = 0;
       int evenNumbers = 0;
       int result = 0;
       for (int i = 0; i < 31; i++) {
        if (i % 2 == 0 && i >= 20) {
            evenNumbers += i;
        }
        if (i % 2 == 1 && i < 20) {
            oddNumbers += i;
            }  
        }
        result = oddNumbers + evenNumbers;
        System.out.println(result);

        // Searching
        String s1 = "welcome to bootcamp.";
        // 1. Find the number of 'o'
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);

        // Approach 1: simple if
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.println(i); // 0,2
            }
            
        }

        // Approach 2: continue
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 1) {
                continue; // skip the rest of code, goes to i++ -> 重新再去個loop的開頭
            }
            System.out.println(i); // 0,2
        }

        // ! for + break
        // Apporach 1: simple if
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.println(i); // 0,1
            }
        }

        // Approach 2: break
        for (int i = 0; i < 3; i++) {
            if (i >= 2) {
                break; // skip the rest of code, goes to i++
            }
            System.out.println(i); // 0,1
        }

        // Question: Sum up 5 - 15 -> result
        // product of 16 - 20 -> result2
        // Single for loop
        int result1 = 0;
        int result2 = 1;
        for (int i = 0; i < 21; i++) {
            if (i > 0 && i < 16) {
                result1 += i;
                continue; // 有continue會更加快
            }
            if (i >= 16) {
                result2 *= i; 
            }
        }
        System.out.println(result1);
        System.out.println(result2);

        for ( int i = 10; i>= 0; i--) {
            System.out.println(i);
        }

        // ! Nested Loop -> VERY DIFFICULT -> LOOP中LOOP
        // i=0, j=0,1
        // i=1, j=0,1
        // i=2, j=0,1
        //所以會print到6次hello
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        

    }


}
