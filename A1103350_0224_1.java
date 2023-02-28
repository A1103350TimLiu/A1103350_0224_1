import java.util.*;

public class A1103350_0224_1 {
    public static void main(String[] argv) {
        int num, r;
        System.out.println("Please enter a number");
        Scanner number = new Scanner(System.in);
        num = number.nextInt();
        r = num % 2;
        if(r==1) {
            System.out.println(num+" is an odd number");
        }
        else if(r==0) {
            System.out.println(num+" is a even number");
        }
    }
}