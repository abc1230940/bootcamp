public class DemoArray {
    public static void main(String[] args) {
        // assign int value 3 into int variable，要寫好多好多個
        int x1 = 3;
        int x2 = 4;
        int x3 = -7;

        // array []
        // right hand side -> creating an array with size 3.
        // ! left hand side -> assign int array object to int array type (variable) 
        int [] arr = new int [3]; // now, we got 3 int boxes able to store 3 int values.

        // write
        // First box (index)
        arr[0] = 3;
        // second box
        arr[1] = 4;
        // third box
        arr[2] = -7;

        for (int i = 0; i < arr.length; i++) { // ! arr.length -> 3 0,1,2
            System.out.println(arr[i]);
        }

        // Question: int array with size 5.
        // 10, 7 ,4 ,-100, 6
        int [] arr2 = new int [5];
        arr2[0] = 10;
        arr2[1] = 7;
        arr2[2] = 4;
        arr2[3] = -100;
        arr2[4] = 6;

        // Question: double array with size 4.
        double [] arr3 = new double [4];
        arr3[0] = 1.0;
        arr3[1] = 66.66;
        arr3[2] = -100.01;
        arr3[3] = 234.567;

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        char [] arr4 = new char [3];
        arr4[0] = 'A';
        arr4[1] = 'B';
        arr4[2] = 'C';

        for (int i = 0; i < arr4.length; i++) { // char做法都係一樣
            System.out.println(arr4[i]);
        }

        String [] arr5 = new String [2];
        arr5[0] = "hello";
        arr5[1] = "bye";

        // read
        System.out.println(arr3[0]); // 1.0

        double amount = 99.9;
        arr3[0] = amount; // 將amount的value assign 去 arr3[0]
        System.out.println(arr3[0]); // 99.9

        double [] amounts = new double [6];
        amounts [0] = 10.9;
        amounts [3] = 14.1;
        amounts [5] = 99.9;
        for (int i = 0; i < amounts.length; i++) {
            System.out.println(amounts[i]);
        }

        // add 1.5 to all array values
        for (int i = 0; i < amounts.length; i++) {
            amounts[i] += 1.5;
            System.out.println(amounts[i]);

        }

        // for + if
        // print out those values > 100
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] > 100.0) {
                System.out.println(amounts[i]);
            }
        }

        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] <= 100.0) {
                continue;
            }
            System.out.println(amounts[i]);
        }

        // int array
        // even number, and then print out "Age=x"
        int [] ages = new int [6];
        ages [0] = 25;
        ages [1] = 46;
        ages [2] = 52;
        ages [3] = 43;
        ages [4] = 63;
        ages [5] = 78;

        for (int i = 0; i < ages.length; i++) {
            if (ages [i] % 2 == 0) {
                System.out.println("Ages = " + ages[i]);
            }
                
            }

        // array for + if
        // find the max value in the array
        int[] numbers = new int[6];
        numbers[0] = 58;
        numbers[1] = 42;
        numbers[2] = 620;
        numbers[3] = 90;
        numbers[4] = 1000;
        numbers[5] = 965;

        int count = Integer.MIN_VALUE; // ! 一定係最細的int數
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > count) {
                count = numbers[i];
            }
        }
        System.out.println(count);

        // find min. value
        int [] salaries = new int [4];
        salaries[0] = 14000;
        salaries[1] = 19000;
        salaries[2] = 21000;
        salaries[3] = 34000;

        int box = Integer.MAX_VALUE; // ! 一定係最大的int數
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < box) {
                box  = salaries[i];
            }
        }
        System.out.println("The min. salary is $" + box);
        
        // John, Steven, Eric
        String [] names = new String [3];
        names[0] = "John";
        names[1] = "Steven";
        names[2] = "Eric";

        // Find the longest name in the array
        String longest = ""; // empty String
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            } 
        }
        System.out.println("The longest name in the array is " + longest);

        
        // nums is an array, a set of int values
        int[] nums = new int[4];
        nums[0] = 9;
        nums[1] = 8;
        nums[2] = 7;
        nums[3] = 10;
        // Find the first even number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
                break; // exit for loop
            }
        }
        
        char [] directions = new char[5];
        // l -> left
        // r -> right

        directions[0] = 'l';
        directions[1] = 'l';
        directions[2] = 'r';
        directions[3] = 'l';
        directions[4] = 'r';
        
        int score = 0;
        for (int i = 0; i < directions.length; i++) {
            if (directions[i] == 'l') {
                score = score + 3;
            } else {
                score = score - 2;
            }

        }
        System.out.println(score);

        // ! Swapping
        int w1 = 2;
        int w2 = 3;
        int backup = w1;
        w1 = w2;
        w2 = backup;
        System.out.println(w1);
        System.out.println(w2);

        int [] marksix = new int[6];
        marksix[0] = 5;
        marksix[1] = 20;
        marksix[2] = 47;
        marksix[3] = 34;
        marksix[4] = 39;
        marksix[5] = 2;
        // 5 20 47 43 39 2
        // ! i = 0; j = 0,1,2,3,4 (marksix[4+1] > marksix[4]) -> j係我地要的東西, i係借助工具
        // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 47 42 39 3
        // round 2: 20 vs 47 (47 > 20, no swap) -> 5 20 47 43 39 3
        // round 3: 47 vs 43 (43 < 47 swap) -> 5 20 43 47 39 3
        // round 4: 47 vs 39 (39 < 47, swap) -> 5 20 43 39 47 3
        // round 5: 47 vs 3 (3 < 47, swap) -> 5 20 43 39 4 47
        // 第一個for loop

        // ! i = 1
        // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 43 39 3 47
        // ....
        // 第二個for loop

        // Finally -> 2 5 20 39 43 47
        // ! Sorting -> (5 x 5) -> very slow -> Bubble Sort
        // Swapping
        int temp = -1;
        for (int i = 0; i < marksix.length - 1; i++) { // i = 0 -> how many times i need to swap
            for (int j = 0; j < marksix.length - i - 1; j++) { // j = 0,1,2,3,4 | j = 0,1,2,3
                if (marksix[j + 1] < marksix[j]) {
                    temp = marksix[j + 1];
                    marksix[j + 1] = marksix[j];
                    marksix[j] = temp;
                }
            }
        }


        for (int i = 0; i < marksix.length; i++) {
            System.out.println(marksix[i]);
        }


        // counting
        char[] chs = new char[] {'o', 'p', 'a', 'p'};
        // count the number of 'p'
        int counter = 0;
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == 'p') {
                counter += 1;
            }
        }
        System.out.println(counter);


        char[] chs2 = new char[] {'o','p','a','p','o'};
        // 有多少character, which 數量 > 1 -> o and p
        // 2
        int [] counts = new int [26]; // 0-25，未define,所以係26個0開始
        for (int i = 0; i < chs2.length; i++) {
            counts[chs2[i] - 'a']++; // ! b - a -> 0, 會跌落0-25呢個range (size =26)，int, 所以要將佢d字母變成數字
        }
        int result = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 1) { // 每個英文字出現的數目
                result ++;
            }
        }
        System.out.println(result); // 2
        
        // 0 9 1 9 2 0 9 9
        // is there any number appear 3 times or more?
        // true
        int [] nums2 = new int [] {0, 9, 1, 9, 2, 0 ,9, 9};
        int [] count2 = new int [10];
            for (int i = 0; i < nums2.length; i++) {
                count2 [nums2[i] - 0]++;
            }
        boolean isThreeTimesOrMore = false;
        for (int i = 0; i < count2.length; i++) {
            if (count2[i] >= 3) {
                isThreeTimesOrMore = true;
            }
        }
        System.out.println(isThreeTimesOrMore);

        String[] lastNames = new String[] {"Lau", "Wong", "Chan"};

    

    }
}

    



