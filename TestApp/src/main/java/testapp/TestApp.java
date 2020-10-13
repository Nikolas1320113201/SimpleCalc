package testapp;
import java.util.Scanner;
/**
 *
 * @author Николай
 */
public class TestApp{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("1st Num:");
        double a =Double.valueOf(in.nextLine());
        System.out.println("2st Num:");
        double b =Double.valueOf(in.nextLine());       
        System.out.println("a+b=" +(a+b));
        System.out.println("Git test application");
}
}
