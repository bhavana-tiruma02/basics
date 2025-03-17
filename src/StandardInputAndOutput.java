import java.util.Scanner;

public class StandardInputAndOutput {

    public static void main(String[] args){

        /* Scanner class is used to read the input from stdin(System.in)

       */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /* for string
        String myString = sc.next();
        */

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
