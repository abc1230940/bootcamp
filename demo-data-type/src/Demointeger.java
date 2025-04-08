public class Demointeger {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // define variable y to store an integer value 100
        int y = 100;

        // print out variable y
        System.out.println(y);

        // reassignment
        y = 200;
        System.out.println(y);

        // int is a data type
        // ! We cannot re-define the type of y
        // We can define the type of y once.
        // int y = 200;

        // + - *
        int a = 1 + 2;
        System.out.println(a); // 3

        // from right to left
        // Assign the result of "y + 2" into y.
        y = y + 2;
        System.out.println(y);

        // - *
        // Define variable b, store 99
        int b = 99;
        // b - 200, but the result into q
        int q = b - 200;
        // print out q
        System.out.println(q);
        // q x 10, put the result into q again
        q = q * 10;
        // print out q
        System.out.println(q);

        int bootcamp = 6 + 10 * 5;
        System.out.println(bootcamp); // 56

        bootcamp = (6 + 10) * 5;
        System.out.println(bootcamp); // 80

        int r = 4 / 2;
        System.out.println(r); // 2

        // ! Put 2.5 into an integer varaible -> trim decimal places (Java)
        int r2 = 5 / 2;
        System.out.println(r2);

        // ! Put ~3.3333 into an integer varaible -> trim decimal places (Java)
        r2 = 10 / 3;
        System.out.println(r); // 3


    }
}
