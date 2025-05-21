import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoUncheckedException {
    public static void main(String[] args) {
       // avoidable
       int[] arr = new int[3];

       // Case 1:
       int index = 0;
       if (index < 0 || index >= arr.length) {
        return;
       }
       System.out.println(arr[index]);

       // unavoidable
       int idxInputtedByUser = -1;
        try {
            System.out.println("start to try...");
            System.out.println(arr[-1]);
            System.out.println("End the try...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Root cause:" + e.getMessage());
            System.out.println("hello");
        }
    
       

       // Case 2:
       String s = "Hello";
       if (s != null) {
        System.out.println(s.charAt(3)); // l
       }

       // Case 3:
       // ! Math
       int count = 0;
       if (count != 0) {
        int result = 10 / count;
       }
       
       // ! String -> Integer
       String yearInputtedByUser = "2025s";
       Integer year = null;
       try {
        year = Integer.valueOf(idxInputtedByUser);
        System.out.println(year);
       } catch (NumberFormatException e) {
        System.out.println("The input is not valid.");
       }
       
       // ! "Unchecked" exception -> Java won't force you to catch during compile time.
       // year = Integer.valueOf("abc");
       String s2 = "hello";
       try {
        s2.charAt(index); // java.lang.StringIndexOutOfBoundsException -> 但係唔係咁樣做try and catch，logic problem, 這個位不應該有問題，不是user的錯
       } catch (StringIndexOutOfBoundsException e) {
        System.out.println("It is StringIndexOutOfBoundsException");
       }
       

       // ! "Checked" exception
       String input = "2025-05-12";
       String targetFormat = "dd/MM/yyyy";
       SimpleDateFormat formatter = new SimpleDateFormat(targetFormat);

       // Case 1: SimpleDateFormat -> parse() method: checked exception
       // ! You have to provide error handling during comple time, Force you to "try"
       try {
        Date Date = formatter.parse(input);
        System.out.println(Date);
       } catch (ParseException e) {
        System.out.println("Error Data: " + input + ". Target format: " + targetFormat);
       }
       

       
    }
}
