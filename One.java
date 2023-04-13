import java.util.regex.*;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Pattern r1 = Pattern.compile("^(a|b)*b(a|b)(a|b)(a|b)$");
        Pattern r2 = Pattern.compile("^(b|aaa(a)*)*$");
        Scanner read = new Scanner(System.in);
        String s ;
        Matcher in;

        System.out.println("Mode 1 = (a|b)*b(a|b)(a|b)(a|b) \nMode 2 = (b|aaa(a)*)* \nplease enter your mode 1 or 2: ");
        int choice = read.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter your string:");
                s = read.next();
                in = r1.matcher(s);
                System.out.printf("The string is grammatically %s", in.matches());
                break;
            case 2:
                System.out.println("Enter your string:");
                s = read.next();
                in = r2.matcher(s);
                System.out.printf("The string is grammatically %s", in.matches());
        }
        read.close();
    }
}